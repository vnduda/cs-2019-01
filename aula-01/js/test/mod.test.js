const mod = require("../mod.js");

test("Mod satisfaz (caso classico)", () => {
  expect(mod(9, 3)).toBe(0);
});

test("Mod nao satisfaz, y inválido", () => {
    expect(() => { mod(5, -1); }).toThrow(RangeError);
});

test("Mod nao satisfaz, x inválido", () => {
    expect(() => { mod(-1, 3); }).toThrow(RangeError);
});

test("argumento null/undefined", () => {
  expect(() => { mod(); }).toThrow();
});

test("argumento nao numerico", () => {
  expect(() => { mod("abcd", 2); }).toThrow(TypeError);
});