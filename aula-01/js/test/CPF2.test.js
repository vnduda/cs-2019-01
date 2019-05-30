const CPF2 = require("../CPF2.js");

test("Caso classico", () => {
  expect(CPF2("70039371158")).toBe(true);
});

test("3024 nao satisfaz", () => {
  expect(CPF2("12345678910")).toBe(false);
});

test("argumento nao string", () => {
  expect(() => { CPF2(123); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
  expect(() => { CPF2("123456789101"); }).toThrow(RangeError);
});
