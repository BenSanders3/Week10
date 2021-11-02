package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Sandwich;

/**
 * @author Ben Sanders - bsanders3
 * CIS 175 Fall 2021
 */
@Repository
public interface SandwichRepository extends JpaRepository<Sandwich, Long>{

}
