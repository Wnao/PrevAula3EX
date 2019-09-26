package br.usjt.hellospringboot.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="previsoes")
public class Previsao implements Serializable{
	private static final long serialVersionUID = 1L;


	//	@Column (name = "id" )
	//	@Size (max = 2)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	// private String dia;
	//	@Column (name = "Min" )
	//	@Size (max = 3)
	private Double min;

	//	@Column (name = "Max" )
	//	@Size (max = 3)
	private Double max;

	//	@Column (name = "hum" )
	//	@Size (max = 3)
	private Double hum;

	//	@Column (name = "des" )
	//	@Size (max = 3)
	private String des;

	//	@Column (name = "data" )
	//	@Size (max = 3)
	private String data;

	//	@Column (name = "hora" )
	//	@Size (max = 3)
	private Double hora;

	//	@Column (name = "latitude" )
	//	@Size (max = 3)
	private Double latitude;

	//	@Column (name = "longitude" )
	//	@Size (max = 3)
	private Double longitude;

	@OneToOne(optional=true, cascade = {CascadeType.ALL})
	@JoinColumn (name = "dia")
	private Dia dia;



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Double getMin() {
		return min;
	}



	public void setMin(Double min) {
		this.min = min;
	}



	public Double getMax() {
		return max;
	}



	public void setMax(Double max) {
		this.max = max;
	}



	public Double getHum() {
		return hum;
	}



	public void setHum(Double hum) {
		this.hum = hum;
	}



	public String getDes() {
		return des;
	}



	public void setDes(String des) {
		this.des = des;
	}



	public String getData() {
		return data;
	}



	public void setData(String data) {
		this.data = data;
	}



	public Double getHora() {
		return hora;
	}



	public void setHora(Double hora) {
		this.hora = hora;
	}



	public Double getLatitude() {
		return latitude;
	}



	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}



	public Double getLongitude() {
		return longitude;
	}



	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}



	public Dia getDia() {
		return dia;
	}



	public void setDia(Dia dia) {
		this.dia = dia;
	}





}
