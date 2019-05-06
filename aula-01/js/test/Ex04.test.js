const mod = require("../Ex04.js");

test("Mod satisfaz (caso classico)", () => {
  expect(mod(9, 3)).toBe(0);
});

test("Mod nao satisfaz, y inválido", () => {
    expect(() => { mod(5, 0); }).toThrow(RangeError);
});

test("Mod nao satisfaz, x inválido", () => {
    expect(() => { mod(-1, 3); }).toThrow(RangeError);
});

