package entidades;	

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


	public class Trabalhador {
		
		private String name;
		private NivelTrabalhador level;
		private Double baseSalary;
		
		private Departamento department;
		private List<HoraContrato> contracts = new ArrayList<>();
		
		public Trabalhador() {
		}

		public Trabalhador(String name, NivelTrabalhador level, Double baseSalary, Departamento department) {
			this.name = name;
			this.level = level;
			this.baseSalary = baseSalary;
			this.department = department;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public NivelTrabalhador getLevel() {
			return level;
		}

		public void setLevel(NivelTrabalhador level) {
			this.level = level;
		}

		public Double getBaseSalary() {
			return baseSalary;
		}

		public void setBaseSalary(Double baseSalary) {
			this.baseSalary = baseSalary;
		}

		public Departamento getDepartment() {
			return department;
		}

		public void setDepartment(Departamento department) {
			this.department = department;
		}

		public List<HoraContrato> getContracts() {
			return contracts;
		}

		public void addContract(HoraContrato contract) {
			contracts.add(contract);
		}
		
		public void removeContract(HoraContrato contract) {
			contracts.remove(contract);
		}
		
		public double income(int year, int month) {
			double sum = baseSalary;
			Calendar cal = Calendar.getInstance();
			for (HoraContrato c : contracts) {
				cal.setTime(c.getDate());
				int c_year = cal.get(Calendar.YEAR);
				int c_month = 1 + cal.get(Calendar.MONTH);
				if (year == c_year && month == c_month) {
					sum += c.totalValue();
				}
			}
			return sum;
		}
	}