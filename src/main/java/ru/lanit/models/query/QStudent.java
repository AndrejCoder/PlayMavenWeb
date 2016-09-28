package ru.lanit.models.query;

import com.avaje.ebean.EbeanServer;
import org.avaje.ebean.typequery.PInteger;
import org.avaje.ebean.typequery.PString;
import org.avaje.ebean.typequery.PUtilDate;
import org.avaje.ebean.typequery.TQRootBean;
import org.avaje.ebean.typequery.TypeQueryBean;
import ru.lanit.models.Student;
import ru.lanit.models.query.assoc.QAssocGroup;

/**
 * Query bean for Student.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QStudent extends TQRootBean<Student,QStudent> {

  private static final QStudent _alias = new QStudent(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QStudent alias() {
    return _alias;
  }

  public PInteger<QStudent> id;
  public PString<QStudent> lastName;
  public PString<QStudent> firstName;
  public PString<QStudent> secondName;
  public QAssocGroup<QStudent> group;
  public PUtilDate<QStudent> birthday;


  /**
   * Construct with a given EbeanServer.
   */
  public QStudent(EbeanServer server) {
    super(Student.class, server);
  }

  /**
   * Construct using the default EbeanServer.
   */
  public QStudent() {
    super(Student.class);
  }

  /**
   * Construct for Alias.
   */
  private QStudent(boolean dummy) {
    super(dummy);
  }
}
