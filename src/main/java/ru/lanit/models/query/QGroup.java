package ru.lanit.models.query;

import com.avaje.ebean.EbeanServer;
import org.avaje.ebean.typequery.PInteger;
import org.avaje.ebean.typequery.PString;
import org.avaje.ebean.typequery.TQRootBean;
import org.avaje.ebean.typequery.TypeQueryBean;
import ru.lanit.models.Group;

/**
 * Query bean for Group.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QGroup extends TQRootBean<Group,QGroup> {

  private static final QGroup _alias = new QGroup(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QGroup alias() {
    return _alias;
  }

  public PInteger<QGroup> id;
  public PString<QGroup> name;


  /**
   * Construct with a given EbeanServer.
   */
  public QGroup(EbeanServer server) {
    super(Group.class, server);
  }

  /**
   * Construct using the default EbeanServer.
   */
  public QGroup() {
    super(Group.class);
  }

  /**
   * Construct for Alias.
   */
  private QGroup(boolean dummy) {
    super(dummy);
  }
}
