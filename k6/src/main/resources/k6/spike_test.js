// random spikes of users


import http from 'k6/http';
import { sleep } from 'k6';

export let options = {
  insecureSkipTLSVerify: true,
  noConnectionReuse: false,
  stages: [
    { duration: '10s', target: 10 }, //below normal
    { duration: '30s', target: 400 },
    { duration: '10s', target: 2000 }, //normal
    { duration: '30s', target: 300 },
    { duration: '1m', target: 3000 }, //load
    { duration: '30s', target: 400 },
    { duration: '1m', target: 5000 }, //breaking point
    { duration: '30s', target: 0 }, //scale down
  ],
};

export default () => {
  http.get('http://localhost:8080/list');
  sleep(1);
};
