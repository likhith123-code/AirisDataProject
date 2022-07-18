// ORM class for table 'sales'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Jul 18 10:02:45 IST 2022
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class sales extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer amount;
  public Integer get_amount() {
    return amount;
  }
  public void set_amount(Integer amount) {
    this.amount = amount;
  }
  public sales with_amount(Integer amount) {
    this.amount = amount;
    return this;
  }
  private String itemtype;
  public String get_itemtype() {
    return itemtype;
  }
  public void set_itemtype(String itemtype) {
    this.itemtype = itemtype;
  }
  public sales with_itemtype(String itemtype) {
    this.itemtype = itemtype;
    return this;
  }
  private java.sql.Date order_date;
  public java.sql.Date get_order_date() {
    return order_date;
  }
  public void set_order_date(java.sql.Date order_date) {
    this.order_date = order_date;
  }
  public sales with_order_date(java.sql.Date order_date) {
    this.order_date = order_date;
    return this;
  }
  private Long order_id;
  public Long get_order_id() {
    return order_id;
  }
  public void set_order_id(Long order_id) {
    this.order_id = order_id;
  }
  public sales with_order_id(Long order_id) {
    this.order_id = order_id;
    return this;
  }
  private Integer regionid;
  public Integer get_regionid() {
    return regionid;
  }
  public void set_regionid(Integer regionid) {
    this.regionid = regionid;
  }
  public sales with_regionid(Integer regionid) {
    this.regionid = regionid;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof sales)) {
      return false;
    }
    sales that = (sales) o;
    boolean equal = true;
    equal = equal && (this.amount == null ? that.amount == null : this.amount.equals(that.amount));
    equal = equal && (this.itemtype == null ? that.itemtype == null : this.itemtype.equals(that.itemtype));
    equal = equal && (this.order_date == null ? that.order_date == null : this.order_date.equals(that.order_date));
    equal = equal && (this.order_id == null ? that.order_id == null : this.order_id.equals(that.order_id));
    equal = equal && (this.regionid == null ? that.regionid == null : this.regionid.equals(that.regionid));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof sales)) {
      return false;
    }
    sales that = (sales) o;
    boolean equal = true;
    equal = equal && (this.amount == null ? that.amount == null : this.amount.equals(that.amount));
    equal = equal && (this.itemtype == null ? that.itemtype == null : this.itemtype.equals(that.itemtype));
    equal = equal && (this.order_date == null ? that.order_date == null : this.order_date.equals(that.order_date));
    equal = equal && (this.order_id == null ? that.order_id == null : this.order_id.equals(that.order_id));
    equal = equal && (this.regionid == null ? that.regionid == null : this.regionid.equals(that.regionid));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.amount = JdbcWritableBridge.readInteger(1, __dbResults);
    this.itemtype = JdbcWritableBridge.readString(2, __dbResults);
    this.order_date = JdbcWritableBridge.readDate(3, __dbResults);
    this.order_id = JdbcWritableBridge.readLong(4, __dbResults);
    this.regionid = JdbcWritableBridge.readInteger(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.amount = JdbcWritableBridge.readInteger(1, __dbResults);
    this.itemtype = JdbcWritableBridge.readString(2, __dbResults);
    this.order_date = JdbcWritableBridge.readDate(3, __dbResults);
    this.order_id = JdbcWritableBridge.readLong(4, __dbResults);
    this.regionid = JdbcWritableBridge.readInteger(5, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(amount, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(itemtype, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(order_date, 3 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeLong(order_id, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(regionid, 5 + __off, 4, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(amount, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(itemtype, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(order_date, 3 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeLong(order_id, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(regionid, 5 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.amount = null;
    } else {
    this.amount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.itemtype = null;
    } else {
    this.itemtype = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.order_date = null;
    } else {
    this.order_date = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.order_id = null;
    } else {
    this.order_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.regionid = null;
    } else {
    this.regionid = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.amount);
    }
    if (null == this.itemtype) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, itemtype);
    }
    if (null == this.order_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_date.getTime());
    }
    if (null == this.order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_id);
    }
    if (null == this.regionid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.regionid);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.amount);
    }
    if (null == this.itemtype) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, itemtype);
    }
    if (null == this.order_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_date.getTime());
    }
    if (null == this.order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_id);
    }
    if (null == this.regionid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.regionid);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(amount==null?"null":"" + amount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(itemtype==null?"null":itemtype, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_date==null?"null":"" + order_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_id==null?"null":"" + order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(regionid==null?"null":"" + regionid, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(amount==null?"null":"" + amount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(itemtype==null?"null":itemtype, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_date==null?"null":"" + order_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_id==null?"null":"" + order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(regionid==null?"null":"" + regionid, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amount = null; } else {
      this.amount = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.itemtype = null; } else {
      this.itemtype = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_date = null; } else {
      this.order_date = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_id = null; } else {
      this.order_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.regionid = null; } else {
      this.regionid = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amount = null; } else {
      this.amount = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.itemtype = null; } else {
      this.itemtype = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_date = null; } else {
      this.order_date = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_id = null; } else {
      this.order_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.regionid = null; } else {
      this.regionid = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    sales o = (sales) super.clone();
    o.order_date = (o.order_date != null) ? (java.sql.Date) o.order_date.clone() : null;
    return o;
  }

  public void clone0(sales o) throws CloneNotSupportedException {
    o.order_date = (o.order_date != null) ? (java.sql.Date) o.order_date.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("amount", this.amount);
    __sqoop$field_map.put("itemtype", this.itemtype);
    __sqoop$field_map.put("order_date", this.order_date);
    __sqoop$field_map.put("order_id", this.order_id);
    __sqoop$field_map.put("regionid", this.regionid);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("amount", this.amount);
    __sqoop$field_map.put("itemtype", this.itemtype);
    __sqoop$field_map.put("order_date", this.order_date);
    __sqoop$field_map.put("order_id", this.order_id);
    __sqoop$field_map.put("regionid", this.regionid);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("amount".equals(__fieldName)) {
      this.amount = (Integer) __fieldVal;
    }
    else    if ("itemtype".equals(__fieldName)) {
      this.itemtype = (String) __fieldVal;
    }
    else    if ("order_date".equals(__fieldName)) {
      this.order_date = (java.sql.Date) __fieldVal;
    }
    else    if ("order_id".equals(__fieldName)) {
      this.order_id = (Long) __fieldVal;
    }
    else    if ("regionid".equals(__fieldName)) {
      this.regionid = (Integer) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("amount".equals(__fieldName)) {
      this.amount = (Integer) __fieldVal;
      return true;
    }
    else    if ("itemtype".equals(__fieldName)) {
      this.itemtype = (String) __fieldVal;
      return true;
    }
    else    if ("order_date".equals(__fieldName)) {
      this.order_date = (java.sql.Date) __fieldVal;
      return true;
    }
    else    if ("order_id".equals(__fieldName)) {
      this.order_id = (Long) __fieldVal;
      return true;
    }
    else    if ("regionid".equals(__fieldName)) {
      this.regionid = (Integer) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
