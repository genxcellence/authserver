const http = require('http');
const NODE_PORT = 3333;

describe("Should give correct response", function () {

    let url = `http://localhost:${NODE_PORT}/api/login/?id=testId&pass=testPass`;
        describe("GET api/login", function () {
                it("returns status 200", function (done) {
                    http.get(url, function (resp) {
                        let data = '';
                        resp.on('data', (chunk) => {
                            data += chunk;
                        });
                        resp.on('end', () => {
                            expect(JSON.parse(data).status).toBe(200);
                          });
                        done();
                    })
                });
        })
})