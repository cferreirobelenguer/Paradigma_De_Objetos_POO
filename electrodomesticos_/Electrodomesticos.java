
package electordomesticos_;

public class Electrodomesticos {

	
	private int precioBase;
	private String color;
	private String consumo;
	private int peso;
	//Valores por defecto sin parámetros
	public Electrodomesticos() {
		//Constructor
		this.precioBase=100;
		this.consumo="F";
		this.peso=5;
		this.color="blanco";
	}
	//precio y peso por parámetro y el resto por defecto
	public Electrodomesticos(int precioBase,int peso) {
		this.precioBase=precioBase;
		this.consumo="F";
		this.peso=peso;
		this.color="blanco";
	}
	//Valores por parámetro
	public Electrodomesticos(int precioBase,String consumo,int peso,String color) {
		this.precioBase=precioBase;
		this.consumo=consumo;
		this.peso=peso;
		this.color=color;
	}
	//métodos getter y setter
	public int getPrecioBase() {
		return precioBase;
	}
	public String getColor() {
		return color;
	}
	public String getConsumo() {
		return consumo;
		
	}
	public int getPeso() {
		return peso;
	}
	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public void comprobarConsumoEnergetico(String consumo) {
		switch(this.consumo) {
		case "A":
			this.consumo=consumo;
			break;
		case "B":
			this.consumo=consumo;
			break;
		case "C":
			this.consumo=consumo;
			break;
		case "D":
			this.consumo=consumo;
			break;
		case "E":
			this.consumo=consumo;
			break;
		case "F":
			this.consumo=consumo;
			break;
		default:
			System.out.println("Ha introducido un dato incorrecto");
		}
	}
	public void comprobarColor(String color) {
		switch(this.color) {
		case "blanco":
			this.color=color;
			break;
		case "negro":
			this.color=color;
			break;
		case "rojo":
			this.color=color;
			break;
		case "azul":
			this.color=color;
			break;
		case "gris":
			this.color=color;
			break;
		case "BLANCO":
			this.color=color;
			break;
		case "NEGRO":
			this.color=color;
			break;
		case "ROJO":
			this.color=color;
			break;
		case "AZUL":
			this.color=color;
			break;
		case "GRIS":
			this.color=color;
			break;
		default:
			System.out.println("Ha introducido un dato incorrecto");
		}
	}
	public void precioFinal() {
		switch(this.consumo) {
		case "A":
			this.precioBase=precioBase+100;
			break;
		case "B":
			this.precioBase=precioBase+80;
			break;
		case "C":
			this.precioBase=precioBase+60;
			break;
		case "D":
			this.precioBase=precioBase+50;
			break;
		case "E":
			this.precioBase=precioBase+30;
			break;
		case "F":
			this.precioBase=precioBase+10;
			break;
		default:
			System.out.println("Ha introducido un dato incorrecto");
		}
		if((this.peso>=0)&&(this.peso<=19)) {
			this.precioBase=this.precioBase+10;
		}else if((this.peso>=20)&&(this.peso<=49)) {
			this.precioBase=this.precioBase+50;
		}else if((this.peso>=50)&&(this.peso<=79)) {
			this.precioBase=this.precioBase+80;
		}else if(this.peso>=80) {
			this.precioBase=this.precioBase+100;
		}
	}
	//Método toString()
	@Override
	public String toString() {
		return "Electrodomesticos [precioBase=" + precioBase + ", color=" + color + ", consumo=" + consumo + ", peso="
				+ peso + "]";
	}

}
