// Path para a requisição (URL)
const PATH = "http://localhost:9876/ds?numero=";

/**
 * Função que obtém um número por extenso dado um número int.
 * Interage com o servidor e exibe o número por extenso para o usuário.
 */
function atualizaNumeroExtenso() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            let dds = extraiNumeroExtensoResposta(xhttp.responseText);
            document.getElementById("resultado").innerHTML = `${dds}`;
        }
    };

    let numero = document.getElementById("numero").value;
    
    xhttp.open("GET", PATH + numero, true);
    xhttp.send();
}

// Funções para integração (satisfazer contrato do servidor)

function extraiNumeroExtensoResposta(resposta) {
    return resposta;
}
