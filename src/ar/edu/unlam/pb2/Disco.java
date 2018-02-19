package ar.edu.unlam.pb2;

public class Disco {
	
	private Double radioInterior;
	private Double radioExterior;
	private Double perimetroExt;
	private Double perimetroInt;
	private Double superficie;
	

		public Disco (Double radioInterior, Double radioExterior){
			
			this.radioInterior=radioInterior;
			this.radioExterior=radioExterior;
			this.perimetroInt= calcularPerimetroInt();
			this.perimetroExt= calcularPerimetroExt();
			
			this.superficie= calcularSup();	
		}
	
	
		public Double getRadioInterior() {
			return radioInterior;
		}
		
		public Double getRadioExterior() {
			return radioExterior;
		}
		
		public Double getPerimetroExterior() {
			return perimetroExt;
		}
		
		public Double getPerimetroInterior() {
			return perimetroInt;
		}
		
		public Double getSuperficie() {
			return superficie;
		}
	

		
		public void cambiarRadioInterior(Double radioInterior) {
			this.radioInterior = radioInterior;
			this.perimetroInt=calcularPerimetroInt();
			this.superficie=calcularSup();	
		}
		
		public void cambiarRadioExterior(Double radioExterior) {
			this.radioExterior = radioExterior;
			this.perimetroExt=calcularPerimetroExt();
			this.superficie=calcularSup();
		}
		
		public Double calcularPerimetroInt(){
			perimetroInt=2 * Math.PI * this.radioInterior;
			return perimetroInt;
		}
		
		public Double calcularPerimetroExt(){
			perimetroExt=2 * Math.PI * this.radioExterior;
			return perimetroExt;
		}
		
		public Double calcularSup(){
			this.superficie= Math.PI * Math.pow(this.radioExterior, 2)-Math.PI * Math.pow(this.radioInterior, 2);
			return superficie;
		}

}
