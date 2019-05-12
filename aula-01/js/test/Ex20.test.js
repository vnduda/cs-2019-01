const CPF = require("../Ex20.js");

test("Caso classico", () => {
  expect(CPF('70039371158')).toBe(true);
});

test("3024 nao satisfaz", () => {
  expect(CPF('12345678910')).toBe(false);
});

test("argumento nao string", () => {
  expect(() => { CPF(123); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
  expect(() => { CPF('123456789101'); }).toThrow(RangeError);
});
