package com.bio4j.model.relationships;

import com.bio4j.model.Relationship;
import com.bio4j.model.RelationshipType;

import com.bio4j.model.uniprot.nodes.Country;
import com.bio4j.model.uniprot.nodes.Institute;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public interface InstituteCountry extends Relationship <
  Institute, Institute.type,
  InstituteCountry, InstituteCountry.type,
  Country, Country.type
> {

  enum type implements RelationshipType <
    Institute, Institute.type,
    InstituteCountry, InstituteCountry.type,
    Country, Country.type
  > {

    instituteCountry;
    public type value() { return instituteCountry; }
    public arity arity() { return arity.manyToOne; }
  }

  // replace this by source/target??
  public Institute getInstitute();    
  public Country getCountry();
}
