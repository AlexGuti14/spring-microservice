package microservices.book.multiplication.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
* This represents a Multiplication (a * b).
*/
@RequiredArgsConstructor
@NoArgsConstructor(force=true)
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public final class Multiplication {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "MULTIPLICATION_ID")
	private Long id;

	// Both factors
	private final int factorA;
	private final int factorB;
	
}
