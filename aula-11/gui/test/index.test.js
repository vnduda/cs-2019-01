const index = require("../index.js");

test("teste para função formataData", () => {
    expect(index.formataData("2019-07-12")).toBe("12-07-2019");
});

test("teste para função montaURL", () => {
    expect(index.montaURL("12/07/2019", "12/07/2019"))
    .toBe("http://localhost:1025/ds?inicio=12/07/2019&final=12/07/2019");
});
