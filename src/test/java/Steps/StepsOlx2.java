package Steps;

import java.io.IOException;

import Elementos.ElementosOlx2;
import Metodos.MetodosOlx2;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;

public class StepsOlx2 {

MetodosOlx2 metodo = new MetodosOlx2 ();
ElementosOlx2 elemento = new ElementosOlx2 ();

@Dado("que esteja na pagina  do site {string}")
public void que_esteja_na_pagina_do_site(String string) {
    metodo.abrirNavegador(string);
}

@Quando("informar um email valido")
public void informar_um_email_valido() throws InterruptedException, IOException {
	metodo.pausar(5000);
metodo.tirarPrint("sim");
	metodo.clicar(elemento.getBtnFechacoock());
    metodo.clicar(elemento.getBtnEntrar());
    metodo.pausar(4000);
    metodo.clicar(elemento.getBtnControleAceitar());
    metodo.preencherDados(elemento.getBtnEmail(), "marcio-carvalho76@flama.biz");
    metodo.clicar(elemento.getBtnContinuar());
}

@Então("sera direcionado para a proxima pagina")
public void sera_direcionado_para_a_proxima_pagina() {

}




}
