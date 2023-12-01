// for long period of times

import http from 'k6/http';
import { sleep } from 'k6';

export let options = {
  insecureSkipTLSVerify: true,
  noConnectionReuse: false,
  stages: [
    { duration: '2m', target: 400 },
    { duration: '1h', target: 400 },
    { duration: '2m', target: 0 },
  ]
};

export default () => {
  http.get('http://localhost:8080/list');
  sleep(1);
};
