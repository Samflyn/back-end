// pushing it to extreme
// ramping up

import http from 'k6/http';
import { sleep } from 'k6';

export let options = {
  insecureSkipTLSVerify: true,
  noConnectionReuse: false,
  stages: [
    { duration: '30s', target: 10 }, //below normal
    { duration: '30s', target: 200 },
    { duration: '30s', target: 200 }, //normal
    { duration: '30s', target: 300 },
    { duration: '30s', target: 300 }, //load
    { duration: '30s', target: 400 },
    { duration: '1m', target: 500 }, //breaking point
    { duration: '30s', target: 0 }, //scale down
  ],
};

export default () => {
  http.get('http://localhost:8080/list');
  sleep(1);
};
