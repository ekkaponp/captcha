package util;

import java.io.IOException;

/**
 * Created by cadet on 1/7/15 AD.
 */
public interface Logger {

    public void persist(String content) throws IOException;
}
