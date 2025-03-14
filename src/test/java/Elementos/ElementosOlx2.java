package Elementos;

import org.openqa.selenium.By;

public class ElementosOlx2 {

	private By BtnFechacoock = By.xpath("//*[@id=\"ds-modal-body-1\"]/div/button/span");
	private By BtnEntrar = By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/span/span/span/a");
	private By BtnControleAceitar = By.id("adopt-accept-all-button");
	private By BtnEmail = By.xpath("//*[@id=\"input-1\"]");
	private By BtnContinuar = By.cssSelector("#__next > div > div.sc-fAfrNB.eHdYhy.olx-container.olx-container--outlined.olx-d-flex > div.sc-eNPDpu.gUfQUE.sc-hmyDHa.eNhvhR > form > div.olx-d-flex.olx-mt-4 > button");










	public By getBtnFechacoock() {
		return BtnFechacoock;
	}












	public void setBtnFechacoock(By btnFechacoock) {
		BtnFechacoock = btnFechacoock;
	}












	public By getBtnControleAceitar() {
		return BtnControleAceitar;
	}












	public By getBtnEntrar() {
		return BtnEntrar;
	}












	public By getBtnEmail() {
		return BtnEmail;
	}












	public By getBtnContinuar() {
		return BtnContinuar;
	}


}
