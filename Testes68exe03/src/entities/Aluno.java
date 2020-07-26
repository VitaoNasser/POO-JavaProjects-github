package entities;

public class Aluno {
	
	public String name;
	public double notaPrimeiroTrimestre;
	public double notaSegundoTrimestre;
	public double notaTerceiroTrimestre;
	
	public double finalGrade() {
		return notaPrimeiroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre;
	}
	
	public String result() {
		if(finalGrade() >= 60) {
			return "PASS";
		} else {
			
			return "FAILED" + "\nMISSING " + String.format("%.2f", 60 - finalGrade()) + " POINTS";
		}
	}
}
