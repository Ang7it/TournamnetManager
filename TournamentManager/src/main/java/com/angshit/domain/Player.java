package com.angshit.domain;

import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 26,nullable = false)
	private String name;
	@Column(length = 6,nullable = false,updatable = false)
	private String gameId;
	
	@ManyToOne
	private League league; 
	
	@Column(updatable = false,nullable = false)
	@CreationTimestamp
	private OffsetDateTime creationDate;
	
	@UpdateTimestamp
	private OffsetDateTime updatedDate;
	
}
