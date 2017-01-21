package src;

class CsvWriter {
//TODO DONE

	private CsvWriterService csvWriterService;

	public CsvWriter() {
		csvWriterService = new CsvWriterService();
	}

	public void write(String[][] lines) {
		csvWriterService.write(lines);
		System.out.println(csvWriterService.getStringBuffer().toString());
	}

}