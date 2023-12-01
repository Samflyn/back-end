import http from 'k6/http';

export let options = {
  insecureSkipTLSVerify: true,
  noConnectionReuse: false,
  vus: 1,
  duration: '1s',
};

const data = () => {
  return http.get('http://localhost:8080/get-proto-first').body;
};

let requestData = 0;

export default () => {
  if (requestData === 0) {
    requestData = data();
  }

  http.post('http://localhost:8080/get-proto', requestData, {
    headers: { 'Content-Type': 'application/octet-stream' },
  });
};
