package com.example.demo2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "careers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class career {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String stream;

    private String title;

    private String salary;

    private String description;

    @Column(name = "scope_percentage")
    private Integer scopePercentage;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getScopePercentage() {
		return scopePercentage;
	}

	public void setScopePercentage(Integer scopePercentage) {
		this.scopePercentage = scopePercentage;
	}
    
    
}