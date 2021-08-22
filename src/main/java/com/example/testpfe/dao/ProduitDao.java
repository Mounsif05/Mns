
package com.example.testpfe.dao;


import com.example.testpfe.bean.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author admin
 */
@Repository
public interface ProduitDao extends JpaRepository<Produit, Long> {

   
    public Produit findByRef(String ref);

    public int deleteByRef(String ref);

}
