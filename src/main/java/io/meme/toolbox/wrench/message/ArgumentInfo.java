package io.meme.toolbox.wrench.message;

import io.meme.toolbox.wrench.utils.NameUtils;
import lombok.*;

import java.io.Serializable;

/**
 * @author meme
 * @since 1.0
 */
@Getter
@AllArgsConstructor(staticName = "of")
@EqualsAndHashCode
public class ArgumentInfo implements Serializable {
    private static final long serialVersionUID = -2807593115732931530L;
    private final String typeName;
    @Setter(AccessLevel.PACKAGE)
    @EqualsAndHashCode.Include
    private String argumentName;
    @Getter(AccessLevel.PACKAGE)
    private final int index;

    public String getShortTypeName() {
        return NameUtils.calcSimpleClassName(typeName);
    }

    //TODO
    public boolean isFinal() {
        throw new UnsupportedOperationException();
    }
}
