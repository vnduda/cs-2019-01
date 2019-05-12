const propriedade153 = require("../propriedade153.js");

test("153 satisfaz (caso classico)", () => {
  expect(propriedade153(153)).toBe(true);
});

test("152 nao satisfaz", () => {
  expect(propriedade153(152)).toBe(false);
});

test("argumento null/undefined", () => {
  expect(() => { propriedade153(); }).toThrow();
});

test("argumento nao numerico", () => {
  expect(() => { propriedade153("abcd"); }).toThrow(TypeError);
});

test("valor menor que 100 ou maior que 999", () => {
  expect(() => propriedade153(1000)).toThrow(RangeError);
});
