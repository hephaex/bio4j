/*
  # ENZYME

  This graph includes all Enzyme terms that are included in the ExPASy ENZYME database but **not** those that have been either _transferred_ or _deleted_.

  You can get more information about the Enzyme database from its [website](http://enzyme.expasy.org/), in particular

  - **[Enzyme description and sample entry](http://enzyme.expasy.org/enzyme_details.html)**
  - the **[User manual](http://enzyme.expasy.org/enzuser.txt)**, which contains a more precise description of the data model

  The main entity here are `Enzyme`s, which are categorized into a hierarchy of classes. There are other graphs which add edges between `Enzyme`s and other entitities such as proteins.
*/
package com.bio4j.model;

import com.bio4j.angulillos.*;
import com.bio4j.angulillos.Arity.*;

public final class ENZYMEGraph<V,E> extends TypedGraph<ENZYMEGraph<V,E>,V,E> {

  public ENZYMEGraph(UntypedGraph<V,E> graph) { super(graph); }

  @Override
  public final ENZYMEGraph<V,E> self() { return this; }

  /*
    ## Enzymes
  */
  public final class Enzyme extends Vertex<Enzyme> {

    private Enzyme(V raw) { super(raw, enzyme); }

    @Override public final Enzyme self() { return this; }
  }

  public final EnzymeType enzyme = new EnzymeType();
  public final class EnzymeType extends VertexType<Enzyme> {

    public final Enzyme fromRaw(V raw) { return new Enzyme(raw); }

    /*
      ### ID

      The ENZYME ID of this enzyme, as a `String`. This property is indexed for unique matches.
    */
    public final ID id = new ID();
    public final class ID extends Property<String> implements FromAtMostOne, ToOne {

      private ID() { super(String.class); }

      public final Index index = new Index();
      public final class Index extends UniqueIndex<ID,String> {

        private Index() { super(id); }
      }
    }

    /*
      ### Cofactors

      The cofactors for this enzyme, stored in an array of `String`s.
    */
    public final Cofactors cofactors = new Cofactors();
    public final class Cofactors extends Property<String[]> implements FromAny {

      private Cofactors() { super(String[].class); }
    }

    /*
      ### Comments

      Enzymes have sometimes text comments; this property will have them as value, stored in a `String` array.
    */
    public final Comments comments = new Comments();
    public final class Comments extends Property<String> implements FromAny {

      private Comments() { super(String.class); }
    }

    /*
      ### Name

      The (official) name of this enzyme.
    */
    public final Name name = new Name();
    public final class Name extends Property<String> implements FromAny, ToOne {

      private Name() { super(String.class); }
    }

    /*
      ### Alternate names

      Sometimes enzymes have alternate names; they are available here as an array of `String`s.
    */
    public final AlternateNames alternateNames = new AlternateNames();
    public final class AlternateNames extends Property<String[]> implements FromAny {

      private AlternateNames() { super(String[].class); }
    }

    /*
      ### Catalytic activity

      Reactions in which this enzyme takes part, described textually.
    */
    public final CatalyticActivity catalyticActivity = new CatalyticActivity();
    public final class CatalyticActivity extends Property<String> implements FromAny {

      private CatalyticActivity() { super(String.class); }
    }
  }

  /*
    ## Enzyme classes, sub-classes, subsub-classes

    Classes are a set of sub-classes, who are a set of subsub-classes, who are a set of enzymes.

    They are defined in [enzclass.txt](ftp://ftp.expasy.org/databases/enzyme/enzclass.txt) from the ENZYME ftp.
  */
  public final class EnzymeClass extends Vertex<EnzymeClass> {

    private EnzymeClass(V raw) { super(raw, enzymeClass); }

    @Override public final EnzymeClass self() { return this; }
  }

  public final EnzymeClassType enzymeClass = new EnzymeClassType();
  public final class EnzymeClassType extends VertexType<EnzymeClass> {

    public final EnzymeClass fromRaw(V raw) { return new EnzymeClass(raw); }

    public final ID id = new ID();
    public final class ID extends Property<String> implements FromAtMostOne, ToOne {

      private ID() { super(String.class); }

      public final Index index = new Index();
      public final class Index extends UniqueIndex<ID,String> {

        private Index() { super(id); }
      }
    }
  }

  public final class EnzymeSubClass extends Vertex<EnzymeSubClass> {

    private EnzymeSubClass(V raw) { super(raw, enzymeSubClass); }

    @Override public final EnzymeSubClass self() { return this; }
  }

  public final EnzymeSubClassType enzymeSubClass = new EnzymeSubClassType();
  public final class EnzymeSubClassType extends VertexType<EnzymeSubClass> {

    public final EnzymeSubClass fromRaw(V raw) { return new EnzymeSubClass(raw); }

    public final ID id = new ID();
    public final class ID extends Property<String> implements FromAtMostOne, ToOne {

      private ID() { super(String.class); }

      public final Index index = new Index();
      public final class Index extends UniqueIndex<ID,String> {

        private Index() { super(id); }
      }
    }
  }

  public final class EnzymeSubSubClass extends Vertex<EnzymeSubSubClass> {

    private EnzymeSubSubClass(V raw) { super(raw, enzymeSubSubClass); }

    @Override public final EnzymeSubSubClass self() { return this; }
  }

  public final EnzymeSubSubClassType enzymeSubSubClass = new EnzymeSubSubClassType();
  public final class EnzymeSubSubClassType extends VertexType<EnzymeSubSubClass> {

    public final EnzymeSubSubClass fromRaw(V raw) { return new EnzymeSubSubClass(raw); }

    public final ID id = new ID();
    public final class ID extends Property<String> implements FromAtMostOne, ToOne {

      private ID() { super(String.class); }

      public final Index index = new Index();
      public final class Index extends UniqueIndex<ID,String> {

        private Index() { super(id); }
      }
    }
  }

  /*
    ### Sub-class, subsub-class edges

    These edges go from an element to its members. The Enzyme ID structure `w.x.y.z` mirrors this structure, where each prefix ending in a dot determines one of these categories. Going up in this hierarchy corresponds to a less specific function. Note that annotations coming from other databases such as UniProt frequently point to enzyme classes, not enzymes themselves.
  */
  public final class SubClasses extends Edge<EnzymeClass, SubClasses, EnzymeSubClass> {

    private SubClasses(E edge) { super(edge, subClasses); }

    @Override
    public final SubClasses self() { return this; }
  }

  public final SubClassesType subClasses = new SubClassesType();
  public final class SubClassesType extends EdgeType<EnzymeClass, SubClasses, EnzymeSubClass> implements FromOne, ToAtLeastOne {

    private SubClassesType() { super(enzymeClass, enzymeSubClass); }

    @Override
    public final SubClasses fromRaw(E edge) { return new SubClasses(edge); }
  }

  public final class SubSubClasses extends Edge<EnzymeSubClass, SubSubClasses, EnzymeSubSubClass> {

    private SubSubClasses(E edge) { super(edge, subSubClasses); }

    @Override
    public final SubSubClasses self() { return this; }
  }

  public final SubSubClassesType subSubClasses = new SubSubClassesType();
  public final class SubSubClassesType extends EdgeType<EnzymeSubClass, SubSubClasses, EnzymeSubSubClass> implements FromOne, ToAtLeastOne {

    private SubSubClassesType() { super(enzymeSubClass, enzymeSubSubClass); }

    @Override
    public final SubSubClasses fromRaw(E edge) { return new SubSubClasses(edge); }
  }

  public final class Enzymes extends Edge<EnzymeSubSubClass, Enzymes, Enzyme> {

    private Enzymes(E edge) { super(edge, enzymes); }

    @Override
    public final Enzymes self() { return this; }
  }

  public final EnzymesType enzymes = new EnzymesType();
  public final class EnzymesType extends EdgeType<EnzymeSubSubClass, Enzymes, Enzyme> implements FromOne, ToAtLeastOne {

    private EnzymesType() { super(enzymeSubSubClass, enzyme); }

    @Override
    public final Enzymes fromRaw(E edge) { return new Enzymes(edge); }
  }
}
