package ru.lanit.models.query.assoc;

import org.avaje.ebean.typequery.PInteger;
import org.avaje.ebean.typequery.PString;
import org.avaje.ebean.typequery.TQAssocBean;
import org.avaje.ebean.typequery.TQProperty;
import org.avaje.ebean.typequery.TypeQueryBean;
import ru.lanit.models.Group;
import ru.lanit.models.query.QGroup;

/**
 * Association query bean for AssocGroup.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QAssocGroup<R> extends TQAssocBean<Group,R> {

  public PInteger<R> id;
  public PString<R> name;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetch(TQProperty<QGroup>... properties) {
    return fetchProperties(properties);
  }

  public QAssocGroup(String name, R root) {
    super(name, root);
  }
}
