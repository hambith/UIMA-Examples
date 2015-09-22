
/* First created by JCasGen Thu Sep 10 09:56:40 CEST 2015 */
package es.upm.ctb.midas.talleruima.ej1;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Thu Sep 10 11:40:07 CEST 2015
 * @generated */
public class Number_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Number_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Number_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Number(addr, Number_Type.this);
  			   Number_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Number(addr, Number_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Number.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("es.upm.ctb.midas.talleruima.ej1.Number");
 
  /** @generated */
  final Feature casFeat_absoluteIntegerValue;
  /** @generated */
  final int     casFeatCode_absoluteIntegerValue;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAbsoluteIntegerValue(int addr) {
        if (featOkTst && casFeat_absoluteIntegerValue == null)
      jcas.throwFeatMissing("absoluteIntegerValue", "es.upm.ctb.midas.talleruima.ej1.Number");
    return ll_cas.ll_getIntValue(addr, casFeatCode_absoluteIntegerValue);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAbsoluteIntegerValue(int addr, int v) {
        if (featOkTst && casFeat_absoluteIntegerValue == null)
      jcas.throwFeatMissing("absoluteIntegerValue", "es.upm.ctb.midas.talleruima.ej1.Number");
    ll_cas.ll_setIntValue(addr, casFeatCode_absoluteIntegerValue, v);}
    
  
 
  /** @generated */
  final Feature casFeat_absoluteDoubleValue;
  /** @generated */
  final int     casFeatCode_absoluteDoubleValue;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getAbsoluteDoubleValue(int addr) {
        if (featOkTst && casFeat_absoluteDoubleValue == null)
      jcas.throwFeatMissing("absoluteDoubleValue", "es.upm.ctb.midas.talleruima.ej1.Number");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_absoluteDoubleValue);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAbsoluteDoubleValue(int addr, double v) {
        if (featOkTst && casFeat_absoluteDoubleValue == null)
      jcas.throwFeatMissing("absoluteDoubleValue", "es.upm.ctb.midas.talleruima.ej1.Number");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_absoluteDoubleValue, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isDouble;
  /** @generated */
  final int     casFeatCode_isDouble;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsDouble(int addr) {
        if (featOkTst && casFeat_isDouble == null)
      jcas.throwFeatMissing("isDouble", "es.upm.ctb.midas.talleruima.ej1.Number");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isDouble);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsDouble(int addr, boolean v) {
        if (featOkTst && casFeat_isDouble == null)
      jcas.throwFeatMissing("isDouble", "es.upm.ctb.midas.talleruima.ej1.Number");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isDouble, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sign;
  /** @generated */
  final int     casFeatCode_sign;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSign(int addr) {
        if (featOkTst && casFeat_sign == null)
      jcas.throwFeatMissing("sign", "es.upm.ctb.midas.talleruima.ej1.Number");
    return ll_cas.ll_getIntValue(addr, casFeatCode_sign);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSign(int addr, int v) {
        if (featOkTst && casFeat_sign == null)
      jcas.throwFeatMissing("sign", "es.upm.ctb.midas.talleruima.ej1.Number");
    ll_cas.ll_setIntValue(addr, casFeatCode_sign, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Number_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_absoluteIntegerValue = jcas.getRequiredFeatureDE(casType, "absoluteIntegerValue", "uima.cas.Integer", featOkTst);
    casFeatCode_absoluteIntegerValue  = (null == casFeat_absoluteIntegerValue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_absoluteIntegerValue).getCode();

 
    casFeat_absoluteDoubleValue = jcas.getRequiredFeatureDE(casType, "absoluteDoubleValue", "uima.cas.Double", featOkTst);
    casFeatCode_absoluteDoubleValue  = (null == casFeat_absoluteDoubleValue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_absoluteDoubleValue).getCode();

 
    casFeat_isDouble = jcas.getRequiredFeatureDE(casType, "isDouble", "uima.cas.Boolean", featOkTst);
    casFeatCode_isDouble  = (null == casFeat_isDouble) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isDouble).getCode();

 
    casFeat_sign = jcas.getRequiredFeatureDE(casType, "sign", "uima.cas.Integer", featOkTst);
    casFeatCode_sign  = (null == casFeat_sign) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sign).getCode();

  }
}



    