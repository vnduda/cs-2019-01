const razaoAurea = require("../razaoAurea.js");

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
    expect(() => { razaoAurea(3, 2, -1); }).toThrow(RangeError);
});
  
