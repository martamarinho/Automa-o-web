package Steps;

import Elementos.ElementosConta;
import Metodos.MetodosConta;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;

public class StepsConta {
	
	MetodosConta metodo = new MetodosConta();
    ElementosConta elemento = new ElementosConta();
    
    
    @Dado("que o usuario esteja na pagina {string}")
    public void que_o_usuario_esteja_na_pagina(String string) {
       metodo.abrirNavegador(string);
    }

    @Quando("ele não preencher os campos necessarios")
    public void ele_não_preencher_os_campos_necessarios() {
        
    }

    @Então("a pagina se mantera a mesma")
    public void a_pagina_se_mantera_a_mesma() {
        
    }

}
