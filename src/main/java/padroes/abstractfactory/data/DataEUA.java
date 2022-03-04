package padroes.abstractfactory.data;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;

public class DataEUA extends Data {

	public DataEUA(LocalDate data) {
		super(data);
	}

	@Override
	public String getData() {
		return SimpleDateFormat.getDateInstance(
				SimpleDateFormat.FULL, Locale.ENGLISH).format(Date.valueOf(data));

	}

	@Override
	public String toString() {
		return this.getData();
	}

}
