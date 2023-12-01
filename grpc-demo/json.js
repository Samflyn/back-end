import http from 'k6/http';

export let options = {
  insecureSkipTLSVerify: true,
  noConnectionReuse: false,
  vus: 1,
  duration: '1s',
};

const data = () => {
  return http.get('http://localhost:8080/get-user-first').body;
};

let requestData = 0;

export default () => {
  if (requestData === 0) {
    requestData = data();
  }

  http.post('http://localhost:8080/get-user', requestData, {
    headers: { 'Content-Type': 'application/json' },
  });
};
