package models;

import java.io.Serializable;
import java.util.List;

public class ExchangeInfo implements Serializable{

	public String timezone;
    public long serverTime;
    public List<RateLimit> rateLimits;
    public List<Object> exchangeFilters;
    public List<Symbol> symbols;
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public long getServerTime() {
		return serverTime;
	}
	public void setServerTime(long serverTime) {
		this.serverTime = serverTime;
	}
	public List<RateLimit> getRateLimits() {
		return rateLimits;
	}
	public void setRateLimits(List<RateLimit> rateLimits) {
		this.rateLimits = rateLimits;
	}
	public List<Object> getExchangeFilters() {
		return exchangeFilters;
	}
	public void setExchangeFilters(List<Object> exchangeFilters) {
		this.exchangeFilters = exchangeFilters;
	}
	public List<Symbol> getSymbols() {
		return symbols;
	}
	public void setSymbols(List<Symbol> symbols) {
		this.symbols = symbols;
	}
	 
    
    
}
