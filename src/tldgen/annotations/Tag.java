/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tldgen.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author Victor
 */
@Retention(RetentionPolicy.SOURCE)
public @interface Tag {
    /**
     * Name of the tag
     */
    String name() default "";
    
    boolean isContentAllowed() default false;
}