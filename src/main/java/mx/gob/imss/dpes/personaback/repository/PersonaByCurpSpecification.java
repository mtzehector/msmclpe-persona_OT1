/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.personaback.repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import mx.gob.imss.dpes.baseback.persistence.BaseSpecification;
import mx.gob.imss.dpes.personaback.entity.McltPersona;
import mx.gob.imss.dpes.personaback.entity.McltPersona_;

/**
 *
 * @author antonio
 */
public class PersonaByCurpSpecification extends BaseSpecification<McltPersona> {

  private final String curp;

  public PersonaByCurpSpecification(String curp) {
    this.curp = curp;
  }

  @Override
  public Predicate toPredicate(Root<McltPersona> root, CriteriaQuery<?> cq,
          CriteriaBuilder cb) {
    return cb.equal(root.get(McltPersona_.curp), this.curp );
  }

}
