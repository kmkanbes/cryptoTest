package models;

import java.io.Serializable;
import java.util.List;

public class Symbol implements Serializable{

	 	private String symbol;
	 	private String status;
	 	private String baseAsset;
	 	private int baseAssetPrecision;
	 	private String quoteAsset;
	 	private int quotePrecision;
	    private int quoteAssetPrecision;
	    private int baseCommissionPrecision;
	    private int quoteCommissionPrecision;
	    private List<String> orderTypes;
	    private boolean icebergAllowed;
	    private boolean ocoAllowed;
	    private boolean quoteOrderQtyMarketAllowed;
	    private boolean isSpotTradingAllowed;
	    private boolean isMarginTradingAllowed;
	    private List<Filter> filters;
	    private List<String> permissions;
		public String getSymbol() {
			return symbol;
		}
		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getBaseAsset() {
			return baseAsset;
		}
		public void setBaseAsset(String baseAsset) {
			this.baseAsset = baseAsset;
		}
		public int getBaseAssetPrecision() {
			return baseAssetPrecision;
		}
		public void setBaseAssetPrecision(int baseAssetPrecision) {
			this.baseAssetPrecision = baseAssetPrecision;
		}
		public String getQuoteAsset() {
			return quoteAsset;
		}
		public void setQuoteAsset(String quoteAsset) {
			this.quoteAsset = quoteAsset;
		}
		public int getQuotePrecision() {
			return quotePrecision;
		}
		public void setQuotePrecision(int quotePrecision) {
			this.quotePrecision = quotePrecision;
		}
		public int getQuoteAssetPrecision() {
			return quoteAssetPrecision;
		}
		public void setQuoteAssetPrecision(int quoteAssetPrecision) {
			this.quoteAssetPrecision = quoteAssetPrecision;
		}
		public int getBaseCommissionPrecision() {
			return baseCommissionPrecision;
		}
		public void setBaseCommissionPrecision(int baseCommissionPrecision) {
			this.baseCommissionPrecision = baseCommissionPrecision;
		}
		public int getQuoteCommissionPrecision() {
			return quoteCommissionPrecision;
		}
		public void setQuoteCommissionPrecision(int quoteCommissionPrecision) {
			this.quoteCommissionPrecision = quoteCommissionPrecision;
		}
		public List<String> getOrderTypes() {
			return orderTypes;
		}
		public void setOrderTypes(List<String> orderTypes) {
			this.orderTypes = orderTypes;
		}
		public boolean isIcebergAllowed() {
			return icebergAllowed;
		}
		public void setIcebergAllowed(boolean icebergAllowed) {
			this.icebergAllowed = icebergAllowed;
		}
		public boolean isOcoAllowed() {
			return ocoAllowed;
		}
		public void setOcoAllowed(boolean ocoAllowed) {
			this.ocoAllowed = ocoAllowed;
		}
		public boolean isQuoteOrderQtyMarketAllowed() {
			return quoteOrderQtyMarketAllowed;
		}
		public void setQuoteOrderQtyMarketAllowed(boolean quoteOrderQtyMarketAllowed) {
			this.quoteOrderQtyMarketAllowed = quoteOrderQtyMarketAllowed;
		}
		public boolean isSpotTradingAllowed() {
			return isSpotTradingAllowed;
		}
		public void setisSpotTradingAllowed(boolean isSpotTradingAllowed) {
			this.isSpotTradingAllowed = isSpotTradingAllowed;
		}
		public boolean isMarginTradingAllowed() {
			return isMarginTradingAllowed;
		}
		public void setisMarginTradingAllowed(boolean isMarginTradingAllowed) {
			this.isMarginTradingAllowed = isMarginTradingAllowed;
		}
		public List<Filter> getFilters() {
			return filters;
		}
		public void setFilters(List<Filter> filters) {
			this.filters = filters;
		}
		public List<String> getPermissions() {
			return permissions;
		}
		public void setPermissions(List<String> permissions) {
			this.permissions = permissions;
		}
	    
	    
	    
	
}
