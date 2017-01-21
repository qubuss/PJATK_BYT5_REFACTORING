package src;

class CsvWriterService {

    private static final char ZNAK = '\"';
    private static final char COMMA = ',';
    private static final String NEWLINE = "\n";

    private StringBuffer stringBuffer;


    public CsvWriterService() {
        stringBuffer = new StringBuffer();
    }

    public void write(String[][] lines){
        for (String[] line : lines) writeLine(line);
    }

    private void writeLine(String[] fields) {
        if (fields.length == 0)
            stringBuffer.append(NEWLINE);
            //System.out.println();
        else {
            writeField(fields[0]);

            for (int i = 1; i < fields.length; i++) {
                //System.out.print(",");
                stringBuffer.append(COMMA);
                writeField(fields[i]);
            }
            stringBuffer.append(NEWLINE);
            //System.out.println();
        }
    }

    private void writeField(String field) {
        if (field.indexOf(COMMA) != -1 || field.indexOf(ZNAK) != -1)
            writeQuoted(field);
        else
            stringBuffer.append(field);
           // System.out.print(field);
    }

    private void writeQuoted(String field) {
        stringBuffer.append(ZNAK);
        //System.out.print(ZNAK);
        for (int i = 0; i < field.length(); i++) {
            char c = field.charAt(i);
            if (c == ZNAK) {
                stringBuffer.append(ZNAK);
                stringBuffer.append(ZNAK);
                //System.out.print("\"\"");
            }
            else
                stringBuffer.append(c);
                //System.out.print(c);
        }
        stringBuffer.append(ZNAK);
        //System.out.print(ZNAK);
    }

    public StringBuffer getStringBuffer() {
        return stringBuffer;
    }



}
