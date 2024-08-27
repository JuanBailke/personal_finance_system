package com.zion.personal_finance_system.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.zion.personal_finance_system.entities.enums.SalarySource;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_salary")
public class Salary implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer salarySource;
	private Instant date;
	private Double amount;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	public Salary() {
	}

	public Salary(Long id, SalarySource salarySource, Instant date, Double amount, User user) {
		super();
		this.id = id;
		setSalarySource(salarySource);
		this.date = date;
		this.amount = amount;
		this.user = user;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public SalarySource getSalarySource() {
		return SalarySource.valueOf(salarySource);
	}


	public void setSalarySource(SalarySource salarySource) {
		if (salarySource != null) {
			this.salarySource = salarySource.getCode();
		}
	}


	public Instant getDate() {
		return date;
	}


	public void setDate(Instant date) {
		this.date = date;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salary other = (Salary) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
