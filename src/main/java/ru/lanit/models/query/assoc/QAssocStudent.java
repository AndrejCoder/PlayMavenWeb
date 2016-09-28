package ru.lanit.models.query.assoc;

import org.avaje.ebean.typequery.PInteger;
import org.avaje.ebean.typequery.PString;
import org.avaje.ebean.typequery.PUtilDate;
import org.avaje.ebean.typequery.TQAssocBean;
import org.avaje.ebean.typequery.TQProperty;
import org.avaje.ebean.typequery.TypeQueryBean;
import ru.lanit.models.Student;
import ru.lanit.models.query.QStudent;

/**
 * Association query bean for AssocStudent.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QAssocStudent<R> extends TQAssocBean<Student,R> {

  public PInteger<R> id;
  public PString<R> lastName;
  public PString<R> firstName;
  public PString<R> secondName;
  public QAssocGroup<R> group;
  public PUtilDate<R> birthday;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetch(TQProperty<QStudent>... properties) {
    return fetchProperties(properties);
  }

  public QAssocStudent(String name, R root) {
    super(name, root);
  }
}
