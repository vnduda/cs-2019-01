const razaoAurea = require("../Ex11.js");

test("Caso Classico", () => {
  expect(razaoAurea(2, 2, 2)).toBe(1.5);
});

test("valor fora da faixa", () => {
  expect(() => { razaoAurea(-1, 2, 2); }).toThrow(RangeError);
});

test("valor fora da faixa", () => {
    expect(() => { razaoAurea(2, 0, 2); }).toThrow(RangeError);
  });

test("valor fora da faixa", () => {
    expect(() => { razaoAurea(2, 2, 0); }).toThrow(RangeError);
});
  
