

/* First created by JCasGen Fri Jul 22 13:16:57 CEST 2016 */
package de.julielab.jcore.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Fri Jul 22 13:16:57 CEST 2016
 * XML source: /home/phil/Documents/Spinfo/Prometheus/Cheiron/desc/spinfo-frequency-types.xml
 * @generated */
public class CoordinationElement extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(CoordinationElement.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected CoordinationElement() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public CoordinationElement(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public CoordinationElement(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public CoordinationElement(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: cat

  /** getter for cat - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCat() {
    if (CoordinationElement_Type.featOkTst && ((CoordinationElement_Type)jcasType).casFeat_cat == null)
      jcasType.jcas.throwFeatMissing("cat", "de.julielab.jcore.types.CoordinationElement");
    return jcasType.ll_cas.ll_getStringValue(addr, ((CoordinationElement_Type)jcasType).casFeatCode_cat);}
    
  /** setter for cat - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCat(String v) {
    if (CoordinationElement_Type.featOkTst && ((CoordinationElement_Type)jcasType).casFeat_cat == null)
      jcasType.jcas.throwFeatMissing("cat", "de.julielab.jcore.types.CoordinationElement");
    jcasType.ll_cas.ll_setStringValue(addr, ((CoordinationElement_Type)jcasType).casFeatCode_cat, v);}    
  }

    