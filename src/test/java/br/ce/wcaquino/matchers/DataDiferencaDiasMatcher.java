package br.ce.wcaquino.matchers;

import java.util.Date;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

import br.ce.wcaquino.utils.DataUtils;

public class DataDiferencaDiasMatcher extends TypeSafeMatcher<Date> {

	private Integer qtDias;
	
	public DataDiferencaDiasMatcher(Integer qtDia) {
		this.qtDias = qtDia;
	}
	
	public void describeTo(Description description) {
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean matchesSafely(Date data) {
		// TODO Auto-generated method stub
		return DataUtils.isMesmaData(data, DataUtils.obterDataComDiferencaDias(qtDias));
	}

}
