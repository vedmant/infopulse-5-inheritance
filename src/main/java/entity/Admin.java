package entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.hibernate.annotations.AttributeAccessor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Entity inheritance example
 */
@Entity(name = "admins")
@DiscriminatorValue(value = "admin")
public class Admin extends User {

}
