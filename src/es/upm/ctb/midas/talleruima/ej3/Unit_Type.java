
/* First created by JCasGen Thu Sep 10 12:05:50 CEST 2015 */
package es.upm.ctb.midas.talleruima.ej3;

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
 * Updated by JCasGen Thu Sep 10 17:16:46 CEST 2015
 * @generated */
public class Unit_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Unit_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Unit_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Unit(addr, Unit_Type.this);
  			   Unit_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Unit(addr, Unit_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Unit.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("es.upm.ctb.midas.talleruima.ej3.Unit");
 
  /** @generated */
  final Feature casFeat_unit;
  /** @generated */
  final int     casFeatCode_unit;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getUnit(int addr) {
        if (featOkTst && casFeat_unit == null)
      jcas.throwFeatMissing("unit", "es.upm.ctb.midas.talleruima.ej3.Unit");
    return ll_cas.ll_getStringValue(addr, casFeatCode_unit);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUnit(int addr, String v) {
        if (featOkTst && casFeat_unit == null)
      jcas.throwFeatMissing("unit", "es.upm.ctb.midas.talleruima.ej3.Unit");
    ll_cas.ll_setStringValue(addr, casFeatCode_unit, v);}
    
  
 
  /** @generated */
  final Feature casFeat_baseUnit;
  /** @generated */
  final int     casFeatCode_baseUnit;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getBaseUnit(int addr) {
        if (featOkTst && casFeat_baseUnit == null)
      jcas.throwFeatMissing("baseUnit", "es.upm.ctb.midas.talleruima.ej3.Unit");
    return ll_cas.ll_getStringValue(addr, casFeatCode_baseUnit);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBaseUnit(int addr, String v) {
        if (featOkTst && casFeat_baseUnit == null)
      jcas.throwFeatMissing("baseUnit", "es.upm.ctb.midas.talleruima.ej3.Unit");
    ll_cas.ll_setStringValue(addr, casFeatCode_baseUnit, v);}
    
  
 
  /** @generated */
  final Feature casFeat_multiplier;
  /** @generated */
  final int     casFeatCode_multiplier;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getMultiplier(int addr) {
        if (featOkTst && casFeat_multiplier == null)
      jcas.throwFeatMissing("multiplier", "es.upm.ctb.midas.talleruima.ej3.Unit");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_multiplier);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMultiplier(int addr, double v) {
        if (featOkTst && casFeat_multiplier == null)
      jcas.throwFeatMissing("multiplier", "es.upm.ctb.midas.talleruima.ej3.Unit");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_multiplier, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Unit_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_unit = jcas.getRequiredFeatureDE(casType, "unit", "uima.cas.String", featOkTst);
    casFeatCode_unit  = (null == casFeat_unit) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_unit).getCode();

 
    casFeat_baseUnit = jcas.getRequiredFeatureDE(casType, "baseUnit", "uima.cas.String", featOkTst);
    casFeatCode_baseUnit  = (null == casFeat_baseUnit) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_baseUnit).getCode();

 
    casFeat_multiplier = jcas.getRequiredFeatureDE(casType, "multiplier", "uima.cas.Double", featOkTst);
    casFeatCode_multiplier  = (null == casFeat_multiplier) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_multiplier).getCode();

  }
}



    