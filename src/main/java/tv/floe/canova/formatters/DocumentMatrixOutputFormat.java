package tv.floe.canova.formatters;

import org.deeplearning4j.topicmodeling.DocumentMatrix;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by mjk on 8/31/14.
 */
public class DocumentMatrixOutputFormat extends BaseOutputFormat<DocumentMatrix>  {
    @Override
    public void write(DocumentMatrix documentMatrix, File file) throws IOException {
        write_obj(documentMatrix, file);
    }

    @Override
    public String write(DocumentMatrix documentMatrix) throws IOException {
        return write_obj(documentMatrix);
    }

    @Override
    public void write(DocumentMatrix documentMatrix, OutputStream os) throws IOException {
        write_obj(documentMatrix, os);
    }
}
