package com.dmcc.sample.pages.expedia;

import com.dmcc.pagegen.exceptions.PageException;
import com.dmcc.sample.pages.expedia.ExpediaField;
import com.dmcc.pagegen.page.mccarterp.McCarterPage;

public class ExpediaPage extends McCarterPage{

private final String url="https://www.expedia.co.uk";
private final String rRoot="../pgenexamples/src/test/resources";

	public ExpediaPage navigate()throws PageException {
		this.setResourcesRoot(rRoot);
		this.navigate(url);
		return this;
	}

	public void clickNbsp()throws PageException{
		this.click(ExpediaField.Nbsp);
	}

	public void setGssSignupPassword(final String value) throws PageException{
		this.setValue(ExpediaField.GssSignupPassword, value);
	}

	public void clickGssSignupPassword()throws PageException{
		this.click(ExpediaField.GssSignupPassword);
	}

	public void clickGssJoinProgramCheck()throws PageException{
		this.click(ExpediaField.GssJoinProgramCheck);
	}

	public void clickGssMarketingEmailOptInCheck()throws PageException{
		this.click(ExpediaField.GssMarketingEmailOptInCheck);
	}

	public void clickGssMarketingEmailOptDefaultValue()throws PageException{
		this.click(ExpediaField.GssMarketingEmailOptDefaultValue);
	}

	public void setGssSigninPassword(final String value) throws PageException{
		this.setValue(ExpediaField.GssSigninPassword, value);
	}

	public void clickGssSigninPassword()throws PageException{
		this.click(ExpediaField.GssSigninPassword);
	}

	public void setFlightOriginHpFlight(final String value) throws PageException{
		this.setValue(ExpediaField.FlightOriginHpFlight, value);
	}

	public void clickFlightOriginHpFlight()throws PageException{
		this.click(ExpediaField.FlightOriginHpFlight);
	}

	public void setFlightDestinationHpFlight(final String value) throws PageException{
		this.setValue(ExpediaField.FlightDestinationHpFlight, value);
	}

	public void clickFlightDestinationHpFlight()throws PageException{
		this.click(ExpediaField.FlightDestinationHpFlight);
	}

	public void setFlight2OriginHpFlight(final String value) throws PageException{
		this.setValue(ExpediaField.Flight2OriginHpFlight, value);
	}

	public void clickFlight2OriginHpFlight()throws PageException{
		this.click(ExpediaField.Flight2OriginHpFlight);
	}

	public void setFlight2DestinationHpFlight(final String value) throws PageException{
		this.setValue(ExpediaField.Flight2DestinationHpFlight, value);
	}

	public void clickFlight2DestinationHpFlight()throws PageException{
		this.click(ExpediaField.Flight2DestinationHpFlight);
	}

	public void clickAddHotel()throws PageException{
		this.click(ExpediaField.AddHotel);
	}

	public void clickAddCar()throws PageException{
		this.click(ExpediaField.AddCar);
	}

	public void setDestination(final String value) throws PageException{
		this.setValue(ExpediaField.Destination, value);
	}

	public void clickDestination()throws PageException{
		this.click(ExpediaField.Destination);
	}

	public void clickHotelAddFlightCheckboxHpHotel()throws PageException{
		this.click(ExpediaField.HotelAddFlightCheckboxHpHotel);
	}

	public void clickPackageRatesCheckboxVariantHpHotel()throws PageException{
		this.click(ExpediaField.PackageRatesCheckboxVariantHpHotel);
	}

	public void setDcty(final String value) throws PageException{
		this.setValue(ExpediaField.Dcty, value);
	}

	public void clickDcty()throws PageException{
		this.click(ExpediaField.Dcty);
	}

	public void clickLapOrSeat()throws PageException{
		this.click(ExpediaField.LapOrSeat);
	}

	public void setPackageOriginHpPackage(final String value) throws PageException{
		this.setValue(ExpediaField.PackageOriginHpPackage, value);
	}

	public void clickPackageOriginHpPackage()throws PageException{
		this.click(ExpediaField.PackageOriginHpPackage);
	}

	public void setPackageDestinationHpPackage(final String value) throws PageException{
		this.setValue(ExpediaField.PackageDestinationHpPackage, value);
	}

	public void clickPackageDestinationHpPackage()throws PageException{
		this.click(ExpediaField.PackageDestinationHpPackage);
	}

	public void setPackageOriginFCHpPackage(final String value) throws PageException{
		this.setValue(ExpediaField.PackageOriginFCHpPackage, value);
	}

	public void clickPackageOriginFCHpPackage()throws PageException{
		this.click(ExpediaField.PackageOriginFCHpPackage);
	}

	public void setPackageDestinationFCHpPackage(final String value) throws PageException{
		this.setValue(ExpediaField.PackageDestinationFCHpPackage, value);
	}

	public void clickPackageDestinationFCHpPackage()throws PageException{
		this.click(ExpediaField.PackageDestinationFCHpPackage);
	}

	public void setLocn(final String value) throws PageException{
		this.setValue(ExpediaField.Locn, value);
	}

	public void clickLocn()throws PageException{
		this.click(ExpediaField.Locn);
	}

	public void setLoc2(final String value) throws PageException{
		this.setValue(ExpediaField.Loc2, value);
	}

	public void clickLoc2()throws PageException{
		this.click(ExpediaField.Loc2);
	}

	public void setLocation(final String value) throws PageException{
		this.setValue(ExpediaField.Location, value);
	}

	public void clickLocation()throws PageException{
		this.click(ExpediaField.Location);
	}

	public void setOriginName(final String value) throws PageException{
		this.setValue(ExpediaField.OriginName, value);
	}

	public void clickOriginName()throws PageException{
		this.click(ExpediaField.OriginName);
	}

	public void setDestinationName(final String value) throws PageException{
		this.setValue(ExpediaField.DestinationName, value);
	}

	public void clickDestinationName()throws PageException{
		this.click(ExpediaField.DestinationName);
	}

	public void setQ(final String value) throws PageException{
		this.setValue(ExpediaField.Q, value);
	}

	public void clickQ()throws PageException{
		this.click(ExpediaField.Q);
	}

	public void setSignupFirstName(final String value) throws PageException{
		this.setValue(ExpediaField.SignupFirstName, value);
	}

	public void clickSignupFirstName()throws PageException{
		this.click(ExpediaField.SignupFirstName);
	}

	public void setSignupLastName(final String value) throws PageException{
		this.setValue(ExpediaField.SignupLastName, value);
	}

	public void clickSignupLastName()throws PageException{
		this.click(ExpediaField.SignupLastName);
	}

	public void setSignupLoginid(final String value) throws PageException{
		this.setValue(ExpediaField.SignupLoginid, value);
	}

	public void clickSignupLoginid()throws PageException{
		this.click(ExpediaField.SignupLoginid);
	}

	public void setSigninLoginid(final String value) throws PageException{
		this.setValue(ExpediaField.SigninLoginid, value);
	}

	public void clickSigninLoginid()throws PageException{
		this.click(ExpediaField.SigninLoginid);
	}

	public void clickGssKeepSigninCheck()throws PageException{
		this.click(ExpediaField.GssKeepSigninCheck);
	}

	public void clickFlightType()throws PageException{
		this.click(ExpediaField.FlightType);
	}

	public void setStarDate(final String value) throws PageException{
		this.setValue(ExpediaField.StarDate, value);
	}

	public void clickStarDate()throws PageException{
		this.click(ExpediaField.StarDate);
	}

	public void setEndDate(final String value) throws PageException{
		this.setValue(ExpediaField.EndDate, value);
	}

	public void clickEndDate()throws PageException{
		this.click(ExpediaField.EndDate);
	}

	public void setFlight2DepartingHpFlight(final String value) throws PageException{
		this.setValue(ExpediaField.Flight2DepartingHpFlight, value);
	}

	public void clickFlight2DepartingHpFlight()throws PageException{
		this.click(ExpediaField.Flight2DepartingHpFlight);
	}

	public void clickAdvancedFlightNonstopHpFlight()throws PageException{
		this.click(ExpediaField.AdvancedFlightNonstopHpFlight);
	}

	public void clickAdvancedFlightRefundableHpFlight()throws PageException{
		this.click(ExpediaField.AdvancedFlightRefundableHpFlight);
	}

	public void setFlightHotelCheckinHpFlight(final String value) throws PageException{
		this.setValue(ExpediaField.FlightHotelCheckinHpFlight, value);
	}

	public void clickFlightHotelCheckinHpFlight()throws PageException{
		this.click(ExpediaField.FlightHotelCheckinHpFlight);
	}

	public void setFlightHotelCheckoutHpFlight(final String value) throws PageException{
		this.setValue(ExpediaField.FlightHotelCheckoutHpFlight, value);
	}

	public void clickFlightHotelCheckoutHpFlight()throws PageException{
		this.click(ExpediaField.FlightHotelCheckoutHpFlight);
	}

	public void clickDriverAgeCheckboxHpFlight()throws PageException{
		this.click(ExpediaField.DriverAgeCheckboxHpFlight);
	}

	public void setDriverAge(final String value) throws PageException{
		this.setValue(ExpediaField.DriverAge, value);
	}

	public void clickDriverAge()throws PageException{
		this.click(ExpediaField.DriverAge);
	}

	public void clickDirect()throws PageException{
		this.click(ExpediaField.Direct);
	}

	public void setStartDate(final String value) throws PageException{
		this.setValue(ExpediaField.StartDate, value);
	}

	public void clickStartDate()throws PageException{
		this.click(ExpediaField.StartDate);
	}

	public void clickDriverAgeCheckboxHpHotel()throws PageException{
		this.click(ExpediaField.DriverAgeCheckboxHpHotel);
	}

	public void clickPackageType()throws PageException{
		this.click(ExpediaField.PackageType);
	}

	public void setPackageDepartingHpPackage(final String value) throws PageException{
		this.setValue(ExpediaField.PackageDepartingHpPackage, value);
	}

	public void clickPackageDepartingHpPackage()throws PageException{
		this.click(ExpediaField.PackageDepartingHpPackage);
	}

	public void setPackageReturningHpPackage(final String value) throws PageException{
		this.setValue(ExpediaField.PackageReturningHpPackage, value);
	}

	public void clickPackageReturningHpPackage()throws PageException{
		this.click(ExpediaField.PackageReturningHpPackage);
	}

	public void setPackageFcDepartingHpPackage(final String value) throws PageException{
		this.setValue(ExpediaField.PackageFcDepartingHpPackage, value);
	}

	public void clickPackageFcDepartingHpPackage()throws PageException{
		this.click(ExpediaField.PackageFcDepartingHpPackage);
	}

	public void setPackageFcReturningHpPackage(final String value) throws PageException{
		this.setValue(ExpediaField.PackageFcReturningHpPackage, value);
	}

	public void clickPackageFcReturningHpPackage()throws PageException{
		this.click(ExpediaField.PackageFcReturningHpPackage);
	}

	public void setPackageHcDepartingHpPackage(final String value) throws PageException{
		this.setValue(ExpediaField.PackageHcDepartingHpPackage, value);
	}

	public void clickPackageHcDepartingHpPackage()throws PageException{
		this.click(ExpediaField.PackageHcDepartingHpPackage);
	}

	public void setPackageHcReturningHpPackage(final String value) throws PageException{
		this.setValue(ExpediaField.PackageHcReturningHpPackage, value);
	}

	public void clickPackageHcReturningHpPackage()throws PageException{
		this.click(ExpediaField.PackageHcReturningHpPackage);
	}

	public void clickPartialHotelBookingHpPackage()throws PageException{
		this.click(ExpediaField.PartialHotelBookingHpPackage);
	}

	public void setPackageCheckinHpPackage(final String value) throws PageException{
		this.setValue(ExpediaField.PackageCheckinHpPackage, value);
	}

	public void clickPackageCheckinHpPackage()throws PageException{
		this.click(ExpediaField.PackageCheckinHpPackage);
	}

	public void setPackageCheckoutHpPackage(final String value) throws PageException{
		this.setValue(ExpediaField.PackageCheckoutHpPackage, value);
	}

	public void clickPackageCheckoutHpPackage()throws PageException{
		this.click(ExpediaField.PackageCheckoutHpPackage);
	}

	public void clickDriverAgeCheckboxHpPackage()throws PageException{
		this.click(ExpediaField.DriverAgeCheckboxHpPackage);
	}

	public void setDate1(final String value) throws PageException{
		this.setValue(ExpediaField.Date1, value);
	}

	public void clickDate1()throws PageException{
		this.click(ExpediaField.Date1);
	}

	public void setDate2(final String value) throws PageException{
		this.setValue(ExpediaField.Date2, value);
	}

	public void clickDate2()throws PageException{
		this.click(ExpediaField.Date2);
	}

	public void clickDriverAgeCheckboxHpCar()throws PageException{
		this.click(ExpediaField.DriverAgeCheckboxHpCar);
	}

	public void setAge(final String value) throws PageException{
		this.setValue(ExpediaField.Age, value);
	}

	public void clickAge()throws PageException{
		this.click(ExpediaField.Age);
	}

	public void clickJourneyType()throws PageException{
		this.click(ExpediaField.JourneyType);
	}

	public void setSDate(final String value) throws PageException{
		this.setValue(ExpediaField.SDate, value);
	}

	public void clickSDate()throws PageException{
		this.click(ExpediaField.SDate);
	}

	public void setEDate(final String value) throws PageException{
		this.setValue(ExpediaField.EDate, value);
	}

	public void clickEDate()throws PageException{
		this.click(ExpediaField.EDate);
	}

	public void clickTabFlightTabHp()throws PageException{
		this.click(ExpediaField.TabFlightTabHp);
	}

	public void clickTabHotelTabHp()throws PageException{
		this.click(ExpediaField.TabHotelTabHp);
	}

	public void clickTabPackageTabHp()throws PageException{
		this.click(ExpediaField.TabPackageTabHp);
	}

	public void clickTabCarTabHp()throws PageException{
		this.click(ExpediaField.TabCarTabHp);
	}

	public void clickTabActivityTabHp()throws PageException{
		this.click(ExpediaField.TabActivityTabHp);
	}

	public void clickTabRailTabHp()throws PageException{
		this.click(ExpediaField.TabRailTabHp);
	}

	public void clickTabOpenSearchTabHp()throws PageException{
		this.click(ExpediaField.TabOpenSearchTabHp);
	}

	public void clickButtonCloseBanner()throws PageException{
		this.click(ExpediaField.ButtonCloseBanner);
	}

	public void clickMobileToggleHeaderLink()throws PageException{
		this.click(ExpediaField.MobileToggleHeaderLink);
	}

	public void clickAccountMenuIcon()throws PageException{
		this.click(ExpediaField.AccountMenuIcon);
	}

	public void clickHeaderAccountMenuSignin()throws PageException{
		this.click(ExpediaField.HeaderAccountMenuSignin);
	}

	public void clickHeaderShopMenu()throws PageException{
		this.click(ExpediaField.HeaderShopMenu);
	}

	public void clickHeaderAccountMenu()throws PageException{
		this.click(ExpediaField.HeaderAccountMenu);
	}

	public void clickHeaderAccountSigninButton()throws PageException{
		this.click(ExpediaField.HeaderAccountSigninButton);
	}

	public void clickHeaderAccountMenuSignedIn()throws PageException{
		this.click(ExpediaField.HeaderAccountMenuSignedIn);
	}

	public void clickHeaderTripMenu()throws PageException{
		this.click(ExpediaField.HeaderTripMenu);
	}

	public void clickHeaderSupportMenu()throws PageException{
		this.click(ExpediaField.HeaderSupportMenu);
	}

	public void clickGssSignupLoginFacebookButton()throws PageException{
		this.click(ExpediaField.GssSignupLoginFacebookButton);
	}

	public void clickGssSignupLoginGoogleButton()throws PageException{
		this.click(ExpediaField.GssSignupLoginGoogleButton);
	}

	public void clickGssSignupLoginNaverButton()throws PageException{
		this.click(ExpediaField.GssSignupLoginNaverButton);
	}

	public void clickGssSignupPasswordIconButton()throws PageException{
		this.click(ExpediaField.GssSignupPasswordIconButton);
	}

	public void clickGssSignupSubmit()throws PageException{
		this.click(ExpediaField.GssSignupSubmit);
	}

	public void clickGssGotoSignin()throws PageException{
		this.click(ExpediaField.GssGotoSignin);
	}

	public void clickGssSigninLoginFacebookButton()throws PageException{
		this.click(ExpediaField.GssSigninLoginFacebookButton);
	}

	public void clickGssSigninLoginGoogleButton()throws PageException{
		this.click(ExpediaField.GssSigninLoginGoogleButton);
	}

	public void clickGssSigninLoginNaverButton()throws PageException{
		this.click(ExpediaField.GssSigninLoginNaverButton);
	}

	public void clickGssSigninPasswordIconButton()throws PageException{
		this.click(ExpediaField.GssSigninPasswordIconButton);
	}

	public void clickGssSigninSubmit()throws PageException{
		this.click(ExpediaField.GssSigninSubmit);
	}

	public void clickGssGotoSignup()throws PageException{
		this.click(ExpediaField.GssGotoSignup);
	}

	public void clickSearchButtonHpPackage()throws PageException{
		this.click(ExpediaField.SearchButtonHpPackage);
	}

	public void setFlightAdultsHpFlight(final FlightAdultsHpFlightEnum value) throws PageException{
		this.setValue(ExpediaField.FlightAdultsHpFlight, value.toString());
	}

	public void clickFlightAdultsHpFlight()throws PageException{
		this.click(ExpediaField.FlightAdultsHpFlight);
	}

	public void setFlightChildrenHpFlight(final FlightChildrenHpFlightEnum value) throws PageException{
		this.setValue(ExpediaField.FlightChildrenHpFlight, value.toString());
	}

	public void clickFlightChildrenHpFlight()throws PageException{
		this.click(ExpediaField.FlightChildrenHpFlight);
	}

	public void setFlightAgeSelect1HpFlight(final FlightAgeSelect1HpFlightEnum value) throws PageException{
		this.setValue(ExpediaField.FlightAgeSelect1HpFlight, value.toString());
	}

	public void clickFlightAgeSelect1HpFlight()throws PageException{
		this.click(ExpediaField.FlightAgeSelect1HpFlight);
	}

	public void setFlightAgeSelect2HpFlight(final FlightAgeSelect2HpFlightEnum value) throws PageException{
		this.setValue(ExpediaField.FlightAgeSelect2HpFlight, value.toString());
	}

	public void clickFlightAgeSelect2HpFlight()throws PageException{
		this.click(ExpediaField.FlightAgeSelect2HpFlight);
	}

	public void setFlightAgeSelect3HpFlight(final FlightAgeSelect3HpFlightEnum value) throws PageException{
		this.setValue(ExpediaField.FlightAgeSelect3HpFlight, value.toString());
	}

	public void clickFlightAgeSelect3HpFlight()throws PageException{
		this.click(ExpediaField.FlightAgeSelect3HpFlight);
	}

	public void setFlightAgeSelect4HpFlight(final FlightAgeSelect4HpFlightEnum value) throws PageException{
		this.setValue(ExpediaField.FlightAgeSelect4HpFlight, value.toString());
	}

	public void clickFlightAgeSelect4HpFlight()throws PageException{
		this.click(ExpediaField.FlightAgeSelect4HpFlight);
	}

	public void setFlightAgeSelect5HpFlight(final FlightAgeSelect5HpFlightEnum value) throws PageException{
		this.setValue(ExpediaField.FlightAgeSelect5HpFlight, value.toString());
	}

	public void clickFlightAgeSelect5HpFlight()throws PageException{
		this.click(ExpediaField.FlightAgeSelect5HpFlight);
	}

	public void setFlightAgeSelect6HpFlight(final FlightAgeSelect6HpFlightEnum value) throws PageException{
		this.setValue(ExpediaField.FlightAgeSelect6HpFlight, value.toString());
	}

	public void clickFlightAgeSelect6HpFlight()throws PageException{
		this.click(ExpediaField.FlightAgeSelect6HpFlight);
	}

	public void setFlightAdvancedPreferredAirlineHpFlight(final FlightAdvancedPreferredAirlineHpFlightEnum value) throws PageException{
		this.setValue(ExpediaField.FlightAdvancedPreferredAirlineHpFlight, value.toString());
	}

	public void clickFlightAdvancedPreferredAirlineHpFlight()throws PageException{
		this.click(ExpediaField.FlightAdvancedPreferredAirlineHpFlight);
	}

	public void setFlightAdvancedPreferredClassHpFlight(final FlightAdvancedPreferredClassHpFlightEnum value) throws PageException{
		this.setValue(ExpediaField.FlightAdvancedPreferredClassHpFlight, value.toString());
	}

	public void clickFlightAdvancedPreferredClassHpFlight()throws PageException{
		this.click(ExpediaField.FlightAdvancedPreferredClassHpFlight);
	}

	public void setFlightHotelsRoomsHpFlight(final FlightHotelsRoomsHpFlightEnum value) throws PageException{
		this.setValue(ExpediaField.FlightHotelsRoomsHpFlight, value.toString());
	}

	public void clickFlightHotelsRoomsHpFlight()throws PageException{
		this.click(ExpediaField.FlightHotelsRoomsHpFlight);
	}

	public void setFlightHotel1AdultsHpFlight(final FlightHotel1AdultsHpFlightEnum value) throws PageException{
		this.setValue(ExpediaField.FlightHotel1AdultsHpFlight, value.toString());
	}

	public void clickFlightHotel1AdultsHpFlight()throws PageException{
		this.click(ExpediaField.FlightHotel1AdultsHpFlight);
	}

	public void setFlightHotel1ChildrenHpFlight(final FlightHotel1ChildrenHpFlightEnum value) throws PageException{
		this.setValue(ExpediaField.FlightHotel1ChildrenHpFlight, value.toString());
	}

	public void clickFlightHotel1ChildrenHpFlight()throws PageException{
		this.click(ExpediaField.FlightHotel1ChildrenHpFlight);
	}

	public void setFlightHotel1AgeSelect1HpFlight(final FlightHotel1AgeSelect1HpFlightEnum value) throws PageException{
		this.setValue(ExpediaField.FlightHotel1AgeSelect1HpFlight, value.toString());
	}

	public void clickFlightHotel1AgeSelect1HpFlight()throws PageException{
		this.click(ExpediaField.FlightHotel1AgeSelect1HpFlight);
	}

	public void setFlightHotel1AgeSelect2HpFlight(final FlightHotel1AgeSelect2HpFlightEnum value) throws PageException{
		this.setValue(ExpediaField.FlightHotel1AgeSelect2HpFlight, value.toString());
	}

	public void clickFlightHotel1AgeSelect2HpFlight()throws PageException{
		this.click(ExpediaField.FlightHotel1AgeSelect2HpFlight);
	}

	public void setFlightHotel1AgeSelect3HpFlight(final FlightHotel1AgeSelect3HpFlightEnum value) throws PageException{
		this.setValue(ExpediaField.FlightHotel1AgeSelect3HpFlight, value.toString());
	}

	public void clickFlightHotel1AgeSelect3HpFlight()throws PageException{
		this.click(ExpediaField.FlightHotel1AgeSelect3HpFlight);
	}

	public void setFlightHotel1AgeSelect4HpFlight(final FlightHotel1AgeSelect4HpFlightEnum value) throws PageException{
		this.setValue(ExpediaField.FlightHotel1AgeSelect4HpFlight, value.toString());
	}

	public void clickFlightHotel1AgeSelect4HpFlight()throws PageException{
		this.click(ExpediaField.FlightHotel1AgeSelect4HpFlight);
	}

	public void setFlightHotel1AgeSelect5HpFlight(final FlightHotel1AgeSelect5HpFlightEnum value) throws PageException{
		this.setValue(ExpediaField.FlightHotel1AgeSelect5HpFlight, value.toString());
	}

	public void clickFlightHotel1AgeSelect5HpFlight()throws PageException{
		this.click(ExpediaField.FlightHotel1AgeSelect5HpFlight);
	}

	public void setFlightHotel1AgeSelect6HpFlight(final FlightHotel1AgeSelect6HpFlightEnum value) throws PageException{
		this.setValue(ExpediaField.FlightHotel1AgeSelect6HpFlight, value.toString());
	}

	public void clickFlightHotel1AgeSelect6HpFlight()throws PageException{
		this.click(ExpediaField.FlightHotel1AgeSelect6HpFlight);
	}

	public void setHotelRoomsHpHotel(final HotelRoomsHpHotelEnum value) throws PageException{
		this.setValue(ExpediaField.HotelRoomsHpHotel, value.toString());
	}

	public void clickHotelRoomsHpHotel()throws PageException{
		this.click(ExpediaField.HotelRoomsHpHotel);
	}

	public void setHotel1AdultsHpHotel(final Hotel1AdultsHpHotelEnum value) throws PageException{
		this.setValue(ExpediaField.Hotel1AdultsHpHotel, value.toString());
	}

	public void clickHotel1AdultsHpHotel()throws PageException{
		this.click(ExpediaField.Hotel1AdultsHpHotel);
	}

	public void setHotel1ChildrenHpHotel(final Hotel1ChildrenHpHotelEnum value) throws PageException{
		this.setValue(ExpediaField.Hotel1ChildrenHpHotel, value.toString());
	}

	public void clickHotel1ChildrenHpHotel()throws PageException{
		this.click(ExpediaField.Hotel1ChildrenHpHotel);
	}

	public void setHotel1AgeSelect1HpHotel(final Hotel1AgeSelect1HpHotelEnum value) throws PageException{
		this.setValue(ExpediaField.Hotel1AgeSelect1HpHotel, value.toString());
	}

	public void clickHotel1AgeSelect1HpHotel()throws PageException{
		this.click(ExpediaField.Hotel1AgeSelect1HpHotel);
	}

	public void setHotel1AgeSelect2HpHotel(final Hotel1AgeSelect2HpHotelEnum value) throws PageException{
		this.setValue(ExpediaField.Hotel1AgeSelect2HpHotel, value.toString());
	}

	public void clickHotel1AgeSelect2HpHotel()throws PageException{
		this.click(ExpediaField.Hotel1AgeSelect2HpHotel);
	}

	public void setHotel1AgeSelect3HpHotel(final Hotel1AgeSelect3HpHotelEnum value) throws PageException{
		this.setValue(ExpediaField.Hotel1AgeSelect3HpHotel, value.toString());
	}

	public void clickHotel1AgeSelect3HpHotel()throws PageException{
		this.click(ExpediaField.Hotel1AgeSelect3HpHotel);
	}

	public void setHotel1AgeSelect4HpHotel(final Hotel1AgeSelect4HpHotelEnum value) throws PageException{
		this.setValue(ExpediaField.Hotel1AgeSelect4HpHotel, value.toString());
	}

	public void clickHotel1AgeSelect4HpHotel()throws PageException{
		this.click(ExpediaField.Hotel1AgeSelect4HpHotel);
	}

	public void setHotel1AgeSelect5HpHotel(final Hotel1AgeSelect5HpHotelEnum value) throws PageException{
		this.setValue(ExpediaField.Hotel1AgeSelect5HpHotel, value.toString());
	}

	public void clickHotel1AgeSelect5HpHotel()throws PageException{
		this.click(ExpediaField.Hotel1AgeSelect5HpHotel);
	}

	public void setHotel1AgeSelect6HpHotel(final Hotel1AgeSelect6HpHotelEnum value) throws PageException{
		this.setValue(ExpediaField.Hotel1AgeSelect6HpHotel, value.toString());
	}

	public void clickHotel1AgeSelect6HpHotel()throws PageException{
		this.click(ExpediaField.Hotel1AgeSelect6HpHotel);
	}

	public void setPackageAdultsHpPackage(final PackageAdultsHpPackageEnum value) throws PageException{
		this.setValue(ExpediaField.PackageAdultsHpPackage, value.toString());
	}

	public void clickPackageAdultsHpPackage()throws PageException{
		this.click(ExpediaField.PackageAdultsHpPackage);
	}

	public void setPackageChildrenHpPackage(final PackageChildrenHpPackageEnum value) throws PageException{
		this.setValue(ExpediaField.PackageChildrenHpPackage, value.toString());
	}

	public void clickPackageChildrenHpPackage()throws PageException{
		this.click(ExpediaField.PackageChildrenHpPackage);
	}

	public void setPackageAgeSelect1HpPackage(final PackageAgeSelect1HpPackageEnum value) throws PageException{
		this.setValue(ExpediaField.PackageAgeSelect1HpPackage, value.toString());
	}

	public void clickPackageAgeSelect1HpPackage()throws PageException{
		this.click(ExpediaField.PackageAgeSelect1HpPackage);
	}

	public void setPackageAgeSelect2HpPackage(final PackageAgeSelect2HpPackageEnum value) throws PageException{
		this.setValue(ExpediaField.PackageAgeSelect2HpPackage, value.toString());
	}

	public void clickPackageAgeSelect2HpPackage()throws PageException{
		this.click(ExpediaField.PackageAgeSelect2HpPackage);
	}

	public void setPackageAgeSelect3HpPackage(final PackageAgeSelect3HpPackageEnum value) throws PageException{
		this.setValue(ExpediaField.PackageAgeSelect3HpPackage, value.toString());
	}

	public void clickPackageAgeSelect3HpPackage()throws PageException{
		this.click(ExpediaField.PackageAgeSelect3HpPackage);
	}

	public void setPackageAgeSelect4HpPackage(final PackageAgeSelect4HpPackageEnum value) throws PageException{
		this.setValue(ExpediaField.PackageAgeSelect4HpPackage, value.toString());
	}

	public void clickPackageAgeSelect4HpPackage()throws PageException{
		this.click(ExpediaField.PackageAgeSelect4HpPackage);
	}

	public void setPackageAgeSelect5HpPackage(final PackageAgeSelect5HpPackageEnum value) throws PageException{
		this.setValue(ExpediaField.PackageAgeSelect5HpPackage, value.toString());
	}

	public void clickPackageAgeSelect5HpPackage()throws PageException{
		this.click(ExpediaField.PackageAgeSelect5HpPackage);
	}

	public void setPackageAgeSelect6HpPackage(final PackageAgeSelect6HpPackageEnum value) throws PageException{
		this.setValue(ExpediaField.PackageAgeSelect6HpPackage, value.toString());
	}

	public void clickPackageAgeSelect6HpPackage()throws PageException{
		this.click(ExpediaField.PackageAgeSelect6HpPackage);
	}

	public void setPackageRoomsHpPackage(final PackageRoomsHpPackageEnum value) throws PageException{
		this.setValue(ExpediaField.PackageRoomsHpPackage, value.toString());
	}

	public void clickPackageRoomsHpPackage()throws PageException{
		this.click(ExpediaField.PackageRoomsHpPackage);
	}

	public void setPackage1AdultsHpPackage(final Package1AdultsHpPackageEnum value) throws PageException{
		this.setValue(ExpediaField.Package1AdultsHpPackage, value.toString());
	}

	public void clickPackage1AdultsHpPackage()throws PageException{
		this.click(ExpediaField.Package1AdultsHpPackage);
	}

	public void setPackage1ChildrenHpPackage(final Package1ChildrenHpPackageEnum value) throws PageException{
		this.setValue(ExpediaField.Package1ChildrenHpPackage, value.toString());
	}

	public void clickPackage1ChildrenHpPackage()throws PageException{
		this.click(ExpediaField.Package1ChildrenHpPackage);
	}

	public void setPackage1AgeSelect1HpPackage(final Package1AgeSelect1HpPackageEnum value) throws PageException{
		this.setValue(ExpediaField.Package1AgeSelect1HpPackage, value.toString());
	}

	public void clickPackage1AgeSelect1HpPackage()throws PageException{
		this.click(ExpediaField.Package1AgeSelect1HpPackage);
	}

	public void setPackage1AgeSelect2HpPackage(final Package1AgeSelect2HpPackageEnum value) throws PageException{
		this.setValue(ExpediaField.Package1AgeSelect2HpPackage, value.toString());
	}

	public void clickPackage1AgeSelect2HpPackage()throws PageException{
		this.click(ExpediaField.Package1AgeSelect2HpPackage);
	}

	public void setPackage1AgeSelect3HpPackage(final Package1AgeSelect3HpPackageEnum value) throws PageException{
		this.setValue(ExpediaField.Package1AgeSelect3HpPackage, value.toString());
	}

	public void clickPackage1AgeSelect3HpPackage()throws PageException{
		this.click(ExpediaField.Package1AgeSelect3HpPackage);
	}

	public void setPackage1AgeSelect4HpPackage(final Package1AgeSelect4HpPackageEnum value) throws PageException{
		this.setValue(ExpediaField.Package1AgeSelect4HpPackage, value.toString());
	}

	public void clickPackage1AgeSelect4HpPackage()throws PageException{
		this.click(ExpediaField.Package1AgeSelect4HpPackage);
	}

	public void setPackage1AgeSelect5HpPackage(final Package1AgeSelect5HpPackageEnum value) throws PageException{
		this.setValue(ExpediaField.Package1AgeSelect5HpPackage, value.toString());
	}

	public void clickPackage1AgeSelect5HpPackage()throws PageException{
		this.click(ExpediaField.Package1AgeSelect5HpPackage);
	}

	public void setPackage1AgeSelect6HpPackage(final Package1AgeSelect6HpPackageEnum value) throws PageException{
		this.setValue(ExpediaField.Package1AgeSelect6HpPackage, value.toString());
	}

	public void clickPackage1AgeSelect6HpPackage()throws PageException{
		this.click(ExpediaField.Package1AgeSelect6HpPackage);
	}

	public void setPackageAdvancedPreferredClassHpPackage(final PackageAdvancedPreferredClassHpPackageEnum value) throws PageException{
		this.setValue(ExpediaField.PackageAdvancedPreferredClassHpPackage, value.toString());
	}

	public void clickPackageAdvancedPreferredClassHpPackage()throws PageException{
		this.click(ExpediaField.PackageAdvancedPreferredClassHpPackage);
	}

	public void setCarPickupTimeHpCar(final CarPickupTimeHpCarEnum value) throws PageException{
		this.setValue(ExpediaField.CarPickupTimeHpCar, value.toString());
	}

	public void clickCarPickupTimeHpCar()throws PageException{
		this.click(ExpediaField.CarPickupTimeHpCar);
	}

	public void setCarDropoffTimeHpCar(final CarDropoffTimeHpCarEnum value) throws PageException{
		this.setValue(ExpediaField.CarDropoffTimeHpCar, value.toString());
	}

	public void clickCarDropoffTimeHpCar()throws PageException{
		this.click(ExpediaField.CarDropoffTimeHpCar);
	}

	public void setCarOptionsTypeHpCar(final CarOptionsTypeHpCarEnum value) throws PageException{
		this.setValue(ExpediaField.CarOptionsTypeHpCar, value.toString());
	}

	public void clickCarOptionsTypeHpCar()throws PageException{
		this.click(ExpediaField.CarOptionsTypeHpCar);
	}

	public void setDepartingTimeHpRail(final DepartingTimeHpRailEnum value) throws PageException{
		this.setValue(ExpediaField.DepartingTimeHpRail, value.toString());
	}

	public void clickDepartingTimeHpRail()throws PageException{
		this.click(ExpediaField.DepartingTimeHpRail);
	}

	public void setDepartureTimeHpRail(final DepartureTimeHpRailEnum value) throws PageException{
		this.setValue(ExpediaField.DepartureTimeHpRail, value.toString());
	}

	public void clickDepartureTimeHpRail()throws PageException{
		this.click(ExpediaField.DepartureTimeHpRail);
	}

	public void setArrivingTimeHpRail(final ArrivingTimeHpRailEnum value) throws PageException{
		this.setValue(ExpediaField.ArrivingTimeHpRail, value.toString());
	}

	public void clickArrivingTimeHpRail()throws PageException{
		this.click(ExpediaField.ArrivingTimeHpRail);
	}

	public void setReturningTimeHpRail(final ReturningTimeHpRailEnum value) throws PageException{
		this.setValue(ExpediaField.ReturningTimeHpRail, value.toString());
	}

	public void clickReturningTimeHpRail()throws PageException{
		this.click(ExpediaField.ReturningTimeHpRail);
	}

	public void setRailAdultsHpRail(final RailAdultsHpRailEnum value) throws PageException{
		this.setValue(ExpediaField.RailAdultsHpRail, value.toString());
	}

	public void clickRailAdultsHpRail()throws PageException{
		this.click(ExpediaField.RailAdultsHpRail);
	}

	public void setChildAgesHpRail(final ChildAgesHpRailEnum value) throws PageException{
		this.setValue(ExpediaField.ChildAgesHpRail, value.toString());
	}

	public void clickChildAgesHpRail()throws PageException{
		this.click(ExpediaField.ChildAgesHpRail);
	}

	public void setYouthAgesHpRail(final YouthAgesHpRailEnum value) throws PageException{
		this.setValue(ExpediaField.YouthAgesHpRail, value.toString());
	}

	public void clickYouthAgesHpRail()throws PageException{
		this.click(ExpediaField.YouthAgesHpRail);
	}

	public void setSeniorAgesHpRail(final SeniorAgesHpRailEnum value) throws PageException{
		this.setValue(ExpediaField.SeniorAgesHpRail, value.toString());
	}

	public void clickSeniorAgesHpRail()throws PageException{
		this.click(ExpediaField.SeniorAgesHpRail);
	}

	public void setChildrenAgeSelect0HpRail(final ChildrenAgeSelect0HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.ChildrenAgeSelect0HpRail, value.toString());
	}

	public void clickChildrenAgeSelect0HpRail()throws PageException{
		this.click(ExpediaField.ChildrenAgeSelect0HpRail);
	}

	public void setChildrenAgeSelect1HpRail(final ChildrenAgeSelect1HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.ChildrenAgeSelect1HpRail, value.toString());
	}

	public void clickChildrenAgeSelect1HpRail()throws PageException{
		this.click(ExpediaField.ChildrenAgeSelect1HpRail);
	}

	public void setChildrenAgeSelect2HpRail(final ChildrenAgeSelect2HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.ChildrenAgeSelect2HpRail, value.toString());
	}

	public void clickChildrenAgeSelect2HpRail()throws PageException{
		this.click(ExpediaField.ChildrenAgeSelect2HpRail);
	}

	public void setChildrenAgeSelect3HpRail(final ChildrenAgeSelect3HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.ChildrenAgeSelect3HpRail, value.toString());
	}

	public void clickChildrenAgeSelect3HpRail()throws PageException{
		this.click(ExpediaField.ChildrenAgeSelect3HpRail);
	}

	public void setChildrenAgeSelect4HpRail(final ChildrenAgeSelect4HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.ChildrenAgeSelect4HpRail, value.toString());
	}

	public void clickChildrenAgeSelect4HpRail()throws PageException{
		this.click(ExpediaField.ChildrenAgeSelect4HpRail);
	}

	public void setChildrenAgeSelect5HpRail(final ChildrenAgeSelect5HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.ChildrenAgeSelect5HpRail, value.toString());
	}

	public void clickChildrenAgeSelect5HpRail()throws PageException{
		this.click(ExpediaField.ChildrenAgeSelect5HpRail);
	}

	public void setChildrenAgeSelect6HpRail(final ChildrenAgeSelect6HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.ChildrenAgeSelect6HpRail, value.toString());
	}

	public void clickChildrenAgeSelect6HpRail()throws PageException{
		this.click(ExpediaField.ChildrenAgeSelect6HpRail);
	}

	public void setChildrenAgeSelect7HpRail(final ChildrenAgeSelect7HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.ChildrenAgeSelect7HpRail, value.toString());
	}

	public void clickChildrenAgeSelect7HpRail()throws PageException{
		this.click(ExpediaField.ChildrenAgeSelect7HpRail);
	}

	public void setChildrenAgeSelect8HpRail(final ChildrenAgeSelect8HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.ChildrenAgeSelect8HpRail, value.toString());
	}

	public void clickChildrenAgeSelect8HpRail()throws PageException{
		this.click(ExpediaField.ChildrenAgeSelect8HpRail);
	}

	public void setYouthsAgeSelect0HpRail(final YouthsAgeSelect0HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.YouthsAgeSelect0HpRail, value.toString());
	}

	public void clickYouthsAgeSelect0HpRail()throws PageException{
		this.click(ExpediaField.YouthsAgeSelect0HpRail);
	}

	public void setYouthsAgeSelect1HpRail(final YouthsAgeSelect1HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.YouthsAgeSelect1HpRail, value.toString());
	}

	public void clickYouthsAgeSelect1HpRail()throws PageException{
		this.click(ExpediaField.YouthsAgeSelect1HpRail);
	}

	public void setYouthsAgeSelect2HpRail(final YouthsAgeSelect2HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.YouthsAgeSelect2HpRail, value.toString());
	}

	public void clickYouthsAgeSelect2HpRail()throws PageException{
		this.click(ExpediaField.YouthsAgeSelect2HpRail);
	}

	public void setYouthsAgeSelect3HpRail(final YouthsAgeSelect3HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.YouthsAgeSelect3HpRail, value.toString());
	}

	public void clickYouthsAgeSelect3HpRail()throws PageException{
		this.click(ExpediaField.YouthsAgeSelect3HpRail);
	}

	public void setYouthsAgeSelect4HpRail(final YouthsAgeSelect4HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.YouthsAgeSelect4HpRail, value.toString());
	}

	public void clickYouthsAgeSelect4HpRail()throws PageException{
		this.click(ExpediaField.YouthsAgeSelect4HpRail);
	}

	public void setYouthsAgeSelect5HpRail(final YouthsAgeSelect5HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.YouthsAgeSelect5HpRail, value.toString());
	}

	public void clickYouthsAgeSelect5HpRail()throws PageException{
		this.click(ExpediaField.YouthsAgeSelect5HpRail);
	}

	public void setYouthsAgeSelect6HpRail(final YouthsAgeSelect6HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.YouthsAgeSelect6HpRail, value.toString());
	}

	public void clickYouthsAgeSelect6HpRail()throws PageException{
		this.click(ExpediaField.YouthsAgeSelect6HpRail);
	}

	public void setYouthsAgeSelect7HpRail(final YouthsAgeSelect7HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.YouthsAgeSelect7HpRail, value.toString());
	}

	public void clickYouthsAgeSelect7HpRail()throws PageException{
		this.click(ExpediaField.YouthsAgeSelect7HpRail);
	}

	public void setYouthsAgeSelect8HpRail(final YouthsAgeSelect8HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.YouthsAgeSelect8HpRail, value.toString());
	}

	public void clickYouthsAgeSelect8HpRail()throws PageException{
		this.click(ExpediaField.YouthsAgeSelect8HpRail);
	}

	public void setSeniorsAgeSelect0HpRail(final SeniorsAgeSelect0HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.SeniorsAgeSelect0HpRail, value.toString());
	}

	public void clickSeniorsAgeSelect0HpRail()throws PageException{
		this.click(ExpediaField.SeniorsAgeSelect0HpRail);
	}

	public void setSeniorsAgeSelect1HpRail(final SeniorsAgeSelect1HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.SeniorsAgeSelect1HpRail, value.toString());
	}

	public void clickSeniorsAgeSelect1HpRail()throws PageException{
		this.click(ExpediaField.SeniorsAgeSelect1HpRail);
	}

	public void setSeniorsAgeSelect2HpRail(final SeniorsAgeSelect2HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.SeniorsAgeSelect2HpRail, value.toString());
	}

	public void clickSeniorsAgeSelect2HpRail()throws PageException{
		this.click(ExpediaField.SeniorsAgeSelect2HpRail);
	}

	public void setSeniorsAgeSelect3HpRail(final SeniorsAgeSelect3HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.SeniorsAgeSelect3HpRail, value.toString());
	}

	public void clickSeniorsAgeSelect3HpRail()throws PageException{
		this.click(ExpediaField.SeniorsAgeSelect3HpRail);
	}

	public void setSeniorsAgeSelect4HpRail(final SeniorsAgeSelect4HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.SeniorsAgeSelect4HpRail, value.toString());
	}

	public void clickSeniorsAgeSelect4HpRail()throws PageException{
		this.click(ExpediaField.SeniorsAgeSelect4HpRail);
	}

	public void setSeniorsAgeSelect5HpRail(final SeniorsAgeSelect5HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.SeniorsAgeSelect5HpRail, value.toString());
	}

	public void clickSeniorsAgeSelect5HpRail()throws PageException{
		this.click(ExpediaField.SeniorsAgeSelect5HpRail);
	}

	public void setSeniorsAgeSelect6HpRail(final SeniorsAgeSelect6HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.SeniorsAgeSelect6HpRail, value.toString());
	}

	public void clickSeniorsAgeSelect6HpRail()throws PageException{
		this.click(ExpediaField.SeniorsAgeSelect6HpRail);
	}

	public void setSeniorsAgeSelect7HpRail(final SeniorsAgeSelect7HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.SeniorsAgeSelect7HpRail, value.toString());
	}

	public void clickSeniorsAgeSelect7HpRail()throws PageException{
		this.click(ExpediaField.SeniorsAgeSelect7HpRail);
	}

	public void setSeniorsAgeSelect8HpRail(final SeniorsAgeSelect8HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.SeniorsAgeSelect8HpRail, value.toString());
	}

	public void clickSeniorsAgeSelect8HpRail()throws PageException{
		this.click(ExpediaField.SeniorsAgeSelect8HpRail);
	}

	public void setRailcardTypeSelect0HpRail(final RailcardTypeSelect0HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.RailcardTypeSelect0HpRail, value.toString());
	}

	public void clickRailcardTypeSelect0HpRail()throws PageException{
		this.click(ExpediaField.RailcardTypeSelect0HpRail);
	}

	public void setRailcardCountSelect0HpRail(final RailcardCountSelect0HpRailEnum value) throws PageException{
		this.setValue(ExpediaField.RailcardCountSelect0HpRail, value.toString());
	}

	public void clickRailcardCountSelect0HpRail()throws PageException{
		this.click(ExpediaField.RailcardCountSelect0HpRail);
	}

	public void clickSkipToMainContent()throws PageException{
		this.click(ExpediaField.SkipToMainContent);
	}

	public void clickDone()throws PageException{
		this.click(ExpediaField.Done);
	}

	public void clickJoinExpediaRewards()throws PageException{
		this.click(ExpediaField.JoinExpediaRewards);
	}

	public void clickCreateAn0Account()throws PageException{
		this.click(ExpediaField.CreateAn0Account);
	}

	public void clickMyAccount()throws PageException{
		this.click(ExpediaField.MyAccount);
	}

	public void clickMyTrips()throws PageException{
		this.click(ExpediaField.MyTrips);
	}

	public void clickMyRewards()throws PageException{
		this.click(ExpediaField.MyRewards);
	}

	public void clickSignOut()throws PageException{
		this.click(ExpediaField.SignOut);
	}

	public void clickHome()throws PageException{
		this.click(ExpediaField.Home);
	}

	public void clickHotels()throws PageException{
		this.click(ExpediaField.Hotels);
	}

	public void clickFlights()throws PageException{
		this.click(ExpediaField.Flights);
	}

	public void clickFlightHotel()throws PageException{
		this.click(ExpediaField.FlightHotel);
	}

	public void clickCar()throws PageException{
		this.click(ExpediaField.Car);
	}

	public void clickTrains()throws PageException{
		this.click(ExpediaField.Trains);
	}

	public void clickHolidayRentals()throws PageException{
		this.click(ExpediaField.HolidayRentals);
	}

	public void clickCollections()throws PageException{
		this.click(ExpediaField.Collections);
	}

	public void clickThingsToDo()throws PageException{
		this.click(ExpediaField.ThingsToDo);
	}

	public void clickLastMinute()throws PageException{
		this.click(ExpediaField.LastMinute);
	}

	public void clickBeach()throws PageException{
		this.click(ExpediaField.Beach);
	}

	public void clickDeals()throws PageException{
		this.click(ExpediaField.Deals);
	}

	public void clickCityBreaks()throws PageException{
		this.click(ExpediaField.CityBreaks);
	}

	public void clickRewards()throws PageException{
		this.click(ExpediaField.Rewards);
	}

	public void clickAddYourProperty()throws PageException{
		this.click(ExpediaField.AddYourProperty);
	}

	public void clickItineraries()throws PageException{
		this.click(ExpediaField.Itineraries);
	}

	public void clickTravellersTools()throws PageException{
		this.click(ExpediaField.TravellersTools);
	}

	public void clickManageMyFlight()throws PageException{
		this.click(ExpediaField.ManageMyFlight);
	}

	public void clickManageMyHotel()throws PageException{
		this.click(ExpediaField.ManageMyHotel);
	}

	public void clickVisasPassports()throws PageException{
		this.click(ExpediaField.VisasPassports);
	}

	public void clickCustomerSupport()throws PageException{
		this.click(ExpediaField.CustomerSupport);
	}

	public void clickFeedback()throws PageException{
		this.click(ExpediaField.Feedback);
	}

	public void clickExpediaRewards()throws PageException{
		this.click(ExpediaField.ExpediaRewards);
	}

	public void clickTermsAndConditions()throws PageException{
		this.click(ExpediaField.TermsAndConditions);
	}

	public void clickTermsOfUse()throws PageException{
		this.click(ExpediaField.TermsOfUse);
	}

	public void clickPrivacyPolicy()throws PageException{
		this.click(ExpediaField.PrivacyPolicy);
	}

	public void clickForgotPassword()throws PageException{
		this.click(ExpediaField.ForgotPassword);
	}

	public void clickTermsApply()throws PageException{
		this.click(ExpediaField.TermsApply);
	}

	public void clickAddYourHotelToExpedia()throws PageException{
		this.click(ExpediaField.AddYourHotelToExpedia);
	}

	public void clickHotel()throws PageException{
		this.click(ExpediaField.Hotel);
	}

	public void clickBeachHoliday()throws PageException{
		this.click(ExpediaField.BeachHoliday);
	}

	public void clickCityBreak()throws PageException{
		this.click(ExpediaField.CityBreak);
	}

	public void clickNewYorkHotels()throws PageException{
		this.click(ExpediaField.NewYorkHotels);
	}

	public void clickParisHotels()throws PageException{
		this.click(ExpediaField.ParisHotels);
	}

	public void clickLasVegasHotels()throws PageException{
		this.click(ExpediaField.LasVegasHotels);
	}

	public void clickRomeHotels()throws PageException{
		this.click(ExpediaField.RomeHotels);
	}

	public void clickBarcelonaHotels()throws PageException{
		this.click(ExpediaField.BarcelonaHotels);
	}

	public void clickAmsterdamHotels()throws PageException{
		this.click(ExpediaField.AmsterdamHotels);
	}

	public void clickDubaiHotels()throws PageException{
		this.click(ExpediaField.DubaiHotels);
	}

	public void clickBerlinHotels()throws PageException{
		this.click(ExpediaField.BerlinHotels);
	}

	public void clickTenerifeHotels()throws PageException{
		this.click(ExpediaField.TenerifeHotels);
	}

	public void clickAlgarveHotels()throws PageException{
		this.click(ExpediaField.AlgarveHotels);
	}

	public void clickMallorcaIslandHotels()throws PageException{
		this.click(ExpediaField.MallorcaIslandHotels);
	}

	public void clickVeniceHotels()throws PageException{
		this.click(ExpediaField.VeniceHotels);
	}

	public void clickPragueHotels()throws PageException{
		this.click(ExpediaField.PragueHotels);
	}

	public void clickFlorenceHotels()throws PageException{
		this.click(ExpediaField.FlorenceHotels);
	}

	public void clickLanzaroteHotels()throws PageException{
		this.click(ExpediaField.LanzaroteHotels);
	}

	public void clickHotelsInTheUKIreland()throws PageException{
		this.click(ExpediaField.HotelsInTheUKIreland);
	}

	public void clickHotelInLondon()throws PageException{
		this.click(ExpediaField.HotelInLondon);
	}

	public void clickLakeDistrictHotel()throws PageException{
		this.click(ExpediaField.LakeDistrictHotel);
	}

	public void clickStayInDublin()throws PageException{
		this.click(ExpediaField.StayInDublin);
	}

	public void clickLondonHotels()throws PageException{
		this.click(ExpediaField.LondonHotels);
	}

	public void clickEdinburghHotels()throws PageException{
		this.click(ExpediaField.EdinburghHotels);
	}

	public void clickDublinHotels()throws PageException{
		this.click(ExpediaField.DublinHotels);
	}

	public void clickManchesterHotels()throws PageException{
		this.click(ExpediaField.ManchesterHotels);
	}

	public void clickBirminghamHotels()throws PageException{
		this.click(ExpediaField.BirminghamHotels);
	}

	public void clickYorkHotels()throws PageException{
		this.click(ExpediaField.YorkHotels);
	}

	public void clickGlasgowHotels()throws PageException{
		this.click(ExpediaField.GlasgowHotels);
	}

	public void clickDevonHotels()throws PageException{
		this.click(ExpediaField.DevonHotels);
	}

	public void clickLiverpoolHotels()throws PageException{
		this.click(ExpediaField.LiverpoolHotels);
	}

	public void clickBristolHotels()throws PageException{
		this.click(ExpediaField.BristolHotels);
	}

	public void clickNewcastleUponTyneHotels()throws PageException{
		this.click(ExpediaField.NewcastleUponTyneHotels);
	}

	public void clickBlackpoolHotels()throws PageException{
		this.click(ExpediaField.BlackpoolHotels);
	}

	public void clickCardiffHotels()throws PageException{
		this.click(ExpediaField.CardiffHotels);
	}

	public void clickBrightonHotels()throws PageException{
		this.click(ExpediaField.BrightonHotels);
	}

	public void clickChesterHotels()throws PageException{
		this.click(ExpediaField.ChesterHotels);
	}

	public void clickParkPlazaWestminsterBridgeLondon()throws PageException{
		this.click(ExpediaField.ParkPlazaWestminsterBridgeLondon);
	}

	public void clickShangriLaHotelAtTheShardLondon()throws PageException{
		this.click(ExpediaField.ShangriLaHotelAtTheShardLondon);
	}

	public void clickInterContinentalLondonTheO2()throws PageException{
		this.click(ExpediaField.InterContinentalLondonTheO2);
	}

	public void clickThePrincipalManchester()throws PageException{
		this.click(ExpediaField.ThePrincipalManchester);
	}

	public void clickTheAlexandraHotel()throws PageException{
		this.click(ExpediaField.TheAlexandraHotel);
	}

	public void clickPrincessStHotel()throws PageException{
		this.click(ExpediaField.PrincessStHotel);
	}

	public void clickLimeWood()throws PageException{
		this.click(ExpediaField.LimeWood);
	}

	public void clickTitanicHotelLiverpool()throws PageException{
		this.click(ExpediaField.TitanicHotelLiverpool);
	}

	public void clickCityCourtyardApartmentsAmpPenthouse()throws PageException{
		this.click(ExpediaField.CityCourtyardApartmentsAmpPenthouse);
	}

	public void clickPeckfortonCastle()throws PageException{
		this.click(ExpediaField.PeckfortonCastle);
	}

	public void clickRamsideHallHotelGolfAndSpa()throws PageException{
		this.click(ExpediaField.RamsideHallHotelGolfAndSpa);
	}

	public void clickCrownePlazaLondonKingsCross()throws PageException{
		this.click(ExpediaField.CrownePlazaLondonKingsCross);
	}

	public void clickStGilesLondonAStGilesHotel()throws PageException{
		this.click(ExpediaField.StGilesLondonAStGilesHotel);
	}

	public void clickTheTowerHotel()throws PageException{
		this.click(ExpediaField.TheTowerHotel);
	}

	public void clickAtlantisThePalm()throws PageException{
		this.click(ExpediaField.AtlantisThePalm);
	}

	public void clickDanaVillas()throws PageException{
		this.click(ExpediaField.DanaVillas);
	}

	public void clickTheGrandAtMoonPalace()throws PageException{
		this.click(ExpediaField.TheGrandAtMoonPalace);
	}

	public void clickSunlightBahiaPrincipeTenerife()throws PageException{
		this.click(ExpediaField.SunlightBahiaPrincipeTenerife);
	}

	public void clickMoonPalaceCancun()throws PageException{
		this.click(ExpediaField.MoonPalaceCancun);
	}

	public void clickTheManhattanAtTimesSquareHotel()throws PageException{
		this.click(ExpediaField.TheManhattanAtTimesSquareHotel);
	}

	public void clickGranCastilloTagoro()throws PageException{
		this.click(ExpediaField.GranCastilloTagoro);
	}

	public void clickFIVEPalmJumeirahDubai()throws PageException{
		this.click(ExpediaField.FIVEPalmJumeirahDubai);
	}

	public void clickSonevaJani()throws PageException{
		this.click(ExpediaField.SonevaJani);
	}

	public void clickHardRockHotelTenerife()throws PageException{
		this.click(ExpediaField.HardRockHotelTenerife);
	}

	public void clickTheCosmopolitanOfLasVegas()throws PageException{
		this.click(ExpediaField.TheCosmopolitanOfLasVegas);
	}

	public void clickAquapetraResortAndSpa()throws PageException{
		this.click(ExpediaField.AquapetraResortAndSpa);
	}

	public void clickHotelRiuPlazaTheGreshamDublin()throws PageException{
		this.click(ExpediaField.HotelRiuPlazaTheGreshamDublin);
	}

	public void clickTheRooseveltHotelNewYorkCity()throws PageException{
		this.click(ExpediaField.TheRooseveltHotelNewYorkCity);
	}

	public void clickHotelEdison()throws PageException{
		this.click(ExpediaField.HotelEdison);
	}

	public void clickCheapFlightDeals()throws PageException{
		this.click(ExpediaField.CheapFlightDeals);
	}

	public void clickParisFlights()throws PageException{
		this.click(ExpediaField.ParisFlights);
	}

	public void clickAmsterdamFlights()throws PageException{
		this.click(ExpediaField.AmsterdamFlights);
	}

	public void clickDublinFlights()throws PageException{
		this.click(ExpediaField.DublinFlights);
	}

	public void clickNewYorkFlights()throws PageException{
		this.click(ExpediaField.NewYorkFlights);
	}

	public void clickRomeFlights()throws PageException{
		this.click(ExpediaField.RomeFlights);
	}

	public void clickBarcelonaFlights()throws PageException{
		this.click(ExpediaField.BarcelonaFlights);
	}

	public void clickBerlinFlights()throws PageException{
		this.click(ExpediaField.BerlinFlights);
	}

	public void clickBangkokFlights()throws PageException{
		this.click(ExpediaField.BangkokFlights);
	}

	public void clickMallorcaIslandFlights()throws PageException{
		this.click(ExpediaField.MallorcaIslandFlights);
	}

	public void clickLasVegasFlights()throws PageException{
		this.click(ExpediaField.LasVegasFlights);
	}

	public void clickMadridFlights()throws PageException{
		this.click(ExpediaField.MadridFlights);
	}

	public void clickVeniceFlights()throws PageException{
		this.click(ExpediaField.VeniceFlights);
	}

	public void clickLosAngelesFlights()throws PageException{
		this.click(ExpediaField.LosAngelesFlights);
	}

	public void clickAlgarveFlights()throws PageException{
		this.click(ExpediaField.AlgarveFlights);
	}

	public void clickLondonFlights()throws PageException{
		this.click(ExpediaField.LondonFlights);
	}

	public void clickHolidays()throws PageException{
		this.click(ExpediaField.Holidays);
	}

	public void clickLastMinuteDeals()throws PageException{
		this.click(ExpediaField.LastMinuteDeals);
	}

	public void clickNewYorkHolidays()throws PageException{
		this.click(ExpediaField.NewYorkHolidays);
	}

	public void clickDubaiHolidays()throws PageException{
		this.click(ExpediaField.DubaiHolidays);
	}

	public void clickAmsterdamHolidays()throws PageException{
		this.click(ExpediaField.AmsterdamHolidays);
	}

	public void clickParisHolidays()throws PageException{
		this.click(ExpediaField.ParisHolidays);
	}

	public void clickLasVegasHolidays()throws PageException{
		this.click(ExpediaField.LasVegasHolidays);
	}

	public void clickOrlandoHolidays()throws PageException{
		this.click(ExpediaField.OrlandoHolidays);
	}

	public void clickBarcelonaHolidays()throws PageException{
		this.click(ExpediaField.BarcelonaHolidays);
	}

	public void clickVeniceHolidays()throws PageException{
		this.click(ExpediaField.VeniceHolidays);
	}

	public void clickDublinHolidays()throws PageException{
		this.click(ExpediaField.DublinHolidays);
	}

	public void clickBoraBoraHolidays()throws PageException{
		this.click(ExpediaField.BoraBoraHolidays);
	}

	public void clickBaliHolidays()throws PageException{
		this.click(ExpediaField.BaliHolidays);
	}

	public void clickMenorcaHolidays()throws PageException{
		this.click(ExpediaField.MenorcaHolidays);
	}

	public void clickRomeHolidays()throws PageException{
		this.click(ExpediaField.RomeHolidays);
	}

	public void clickIbizaHolidays()throws PageException{
		this.click(ExpediaField.IbizaHolidays);
	}

	public void clickCarHire()throws PageException{
		this.click(ExpediaField.CarHire);
	}

	public void clickLondonCarHire()throws PageException{
		this.click(ExpediaField.LondonCarHire);
	}

	public void clickOrlandoCarHire()throws PageException{
		this.click(ExpediaField.OrlandoCarHire);
	}

	public void clickDublinCarHire()throws PageException{
		this.click(ExpediaField.DublinCarHire);
	}

	public void clickEdinburghCarHire()throws PageException{
		this.click(ExpediaField.EdinburghCarHire);
	}

	public void clickLosAngelesCarHire()throws PageException{
		this.click(ExpediaField.LosAngelesCarHire);
	}

	public void clickBelfastCarHire()throws PageException{
		this.click(ExpediaField.BelfastCarHire);
	}

	public void clickFaroCarHire()throws PageException{
		this.click(ExpediaField.FaroCarHire);
	}

	public void clickMalagaCarHire()throws PageException{
		this.click(ExpediaField.MalagaCarHire);
	}

	public void clickPalmaDeMallorcaCarHire()throws PageException{
		this.click(ExpediaField.PalmaDeMallorcaCarHire);
	}

	public void clickManchesterCarHire()throws PageException{
		this.click(ExpediaField.ManchesterCarHire);
	}

	public void clickThingsToDoInBarcelona()throws PageException{
		this.click(ExpediaField.ThingsToDoInBarcelona);
	}

	public void clickThingsToDoInBerlin()throws PageException{
		this.click(ExpediaField.ThingsToDoInBerlin);
	}

	public void clickThingsToDoInVenice()throws PageException{
		this.click(ExpediaField.ThingsToDoInVenice);
	}

	public void clickThingsToDoInLondon()throws PageException{
		this.click(ExpediaField.ThingsToDoInLondon);
	}

	public void clickThingsToDoInDublin()throws PageException{
		this.click(ExpediaField.ThingsToDoInDublin);
	}

	public void clickThingsToDoInLasVegas()throws PageException{
		this.click(ExpediaField.ThingsToDoInLasVegas);
	}

	public void clickThingsToDoInLosAngeles()throws PageException{
		this.click(ExpediaField.ThingsToDoInLosAngeles);
	}

	public void clickThingsToDoInNewYork()throws PageException{
		this.click(ExpediaField.ThingsToDoInNewYork);
	}

	public void clickThingsToDoInParis()throws PageException{
		this.click(ExpediaField.ThingsToDoInParis);
	}

	public void clickThingsToDoInRome()throws PageException{
		this.click(ExpediaField.ThingsToDoInRome);
	}

	public void clickThingsToDoInTenerife()throws PageException{
		this.click(ExpediaField.ThingsToDoInTenerife);
	}

	public void clickBeachHolidays()throws PageException{
		this.click(ExpediaField.BeachHolidays);
	}

	public void clickSkiHolidays()throws PageException{
		this.click(ExpediaField.SkiHolidays);
	}

	public void clickDisneylandParisBreaks()throws PageException{
		this.click(ExpediaField.DisneylandParisBreaks);
	}

	public void clickPackageHolidays()throws PageException{
		this.click(ExpediaField.PackageHolidays);
	}

	public void clickWhereToGo()throws PageException{
		this.click(ExpediaField.WhereToGo);
	}

	public void click72HoursIn()throws PageException{
		this.click(ExpediaField.VALUE_OF_72HoursIn);
	}

	public void clickTravelByTrain()throws PageException{
		this.click(ExpediaField.TravelByTrain);
	}

	public void clickHotelDeals()throws PageException{
		this.click(ExpediaField.HotelDeals);
	}

	public void clickAllInclusiveHolidays()throws PageException{
		this.click(ExpediaField.AllInclusiveHolidays);
	}

	public void clickFlightDeals()throws PageException{
		this.click(ExpediaField.FlightDeals);
	}

	public void clickBlog()throws PageException{
		this.click(ExpediaField.Blog);
	}

	public void clickTheHotelEdit()throws PageException{
		this.click(ExpediaField.TheHotelEdit);
	}

	public void clickLGBTHolidays()throws PageException{
		this.click(ExpediaField.LGBTHolidays);
	}

	public void clickCastleHolidays()throws PageException{
		this.click(ExpediaField.CastleHolidays);
	}

	public void clickFamilyHolidays()throws PageException{
		this.click(ExpediaField.FamilyHolidays);
	}

	public void clickAccommodation()throws PageException{
		this.click(ExpediaField.Accommodation);
	}

	public void clickAboutUs()throws PageException{
		this.click(ExpediaField.AboutUs);
	}

	public void clickAdvertising()throws PageException{
		this.click(ExpediaField.Advertising);
	}

	public void clickNewsroom()throws PageException{
		this.click(ExpediaField.Newsroom);
	}

	public void clickJobs()throws PageException{
		this.click(ExpediaField.Jobs);
	}

	public void clickCookiePolicy()throws PageException{
		this.click(ExpediaField.CookiePolicy);
	}

	public void clickGeneralTermsAndConditions()throws PageException{
		this.click(ExpediaField.GeneralTermsAndConditions);
	}

	public void clickMSAStatement()throws PageException{
		this.click(ExpediaField.MSAStatement);
	}

	public void clickSiteMap()throws PageException{
		this.click(ExpediaField.SiteMap);
	}

	public void clickExpediaPartnerCentral()throws PageException{
		this.click(ExpediaField.ExpediaPartnerCentral);
	}

	public void clickAddAHotel()throws PageException{
		this.click(ExpediaField.AddAHotel);
	}

	public void clickExpediaAffiliateNetworkAPI()throws PageException{
		this.click(ExpediaField.ExpediaAffiliateNetworkAPI);
	}

	public void clickAddAnActivity()throws PageException{
		this.click(ExpediaField.AddAnActivity);
	}

	public void clickBecomeAnAffiliate()throws PageException{
		this.click(ExpediaField.BecomeAnAffiliate);
	}

	public void clickTravelAgencies()throws PageException{
		this.click(ExpediaField.TravelAgencies);
	}

	public void clickArgentina()throws PageException{
		this.click(ExpediaField.Argentina);
	}

	public void clickAustralia()throws PageException{
		this.click(ExpediaField.Australia);
	}

	public void clickAustria()throws PageException{
		this.click(ExpediaField.Austria);
	}

	public void clickBelgium()throws PageException{
		this.click(ExpediaField.Belgium);
	}

	public void clickBrazil()throws PageException{
		this.click(ExpediaField.Brazil);
	}

	public void clickCanada()throws PageException{
		this.click(ExpediaField.Canada);
	}

	public void clickChina()throws PageException{
		this.click(ExpediaField.China);
	}

	public void clickDenmark()throws PageException{
		this.click(ExpediaField.Denmark);
	}

	public void clickFinland()throws PageException{
		this.click(ExpediaField.Finland);
	}

	public void clickFlagChile()throws PageException{
		this.click(ExpediaField.FlagChile);
	}

	public void clickFlagColombia()throws PageException{
		this.click(ExpediaField.FlagColombia);
	}

	public void clickFlagCostaRica()throws PageException{
		this.click(ExpediaField.FlagCostaRica);
	}

	public void clickFlagEgypt()throws PageException{
		this.click(ExpediaField.FlagEgypt);
	}

	public void clickFlagEuroCatchAll()throws PageException{
		this.click(ExpediaField.FlagEuroCatchAll);
	}

	public void clickFlagPeru()throws PageException{
		this.click(ExpediaField.FlagPeru);
	}

	public void clickFlagSaudiArabia()throws PageException{
		this.click(ExpediaField.FlagSaudiArabia);
	}

	public void clickFlagUAE()throws PageException{
		this.click(ExpediaField.FlagUAE);
	}

	public void clickFrance()throws PageException{
		this.click(ExpediaField.France);
	}

	public void clickGermany()throws PageException{
		this.click(ExpediaField.Germany);
	}

	public void clickHongKong()throws PageException{
		this.click(ExpediaField.HongKong);
	}

	public void clickIndia()throws PageException{
		this.click(ExpediaField.India);
	}

	public void clickIndonesia()throws PageException{
		this.click(ExpediaField.Indonesia);
	}

	public void clickIreland()throws PageException{
		this.click(ExpediaField.Ireland);
	}

	public void clickItaly()throws PageException{
		this.click(ExpediaField.Italy);
	}

	public void clickJapan()throws PageException{
		this.click(ExpediaField.Japan);
	}

	public void clickKorea()throws PageException{
		this.click(ExpediaField.Korea);
	}

	public void clickMalaysia()throws PageException{
		this.click(ExpediaField.Malaysia);
	}

	public void clickMexico()throws PageException{
		this.click(ExpediaField.Mexico);
	}

	public void clickNetherlands()throws PageException{
		this.click(ExpediaField.Netherlands);
	}

	public void clickNewZealand()throws PageException{
		this.click(ExpediaField.NewZealand);
	}

	public void clickNorway()throws PageException{
		this.click(ExpediaField.Norway);
	}

	public void clickPhilippines()throws PageException{
		this.click(ExpediaField.Philippines);
	}

	public void clickSingapore()throws PageException{
		this.click(ExpediaField.Singapore);
	}

	public void clickSpain()throws PageException{
		this.click(ExpediaField.Spain);
	}

	public void clickSweden()throws PageException{
		this.click(ExpediaField.Sweden);
	}

	public void clickSwitzerland()throws PageException{
		this.click(ExpediaField.Switzerland);
	}

	public void clickTaiwan()throws PageException{
		this.click(ExpediaField.Taiwan);
	}

	public void clickThailand()throws PageException{
		this.click(ExpediaField.Thailand);
	}

	public void clickUnitedKingdom()throws PageException{
		this.click(ExpediaField.UnitedKingdom);
	}

	public void clickUnitedStates()throws PageException{
		this.click(ExpediaField.UnitedStates);
	}

	public void clickVietnam()throws PageException{
		this.click(ExpediaField.Vietnam);
	}

	public void clickExpediaAffiliateNetworkEAN()throws PageException{
		this.click(ExpediaField.ExpediaAffiliateNetworkEAN);
	}

	public void clickHotelsCom()throws PageException{
		this.click(ExpediaField.HotelsCom);
	}

	public void clickEgenciaBusinessTravel()throws PageException{
		this.click(ExpediaField.EgenciaBusinessTravel);
	}

	public void clickTrivago()throws PageException{
		this.click(ExpediaField.Trivago);
	}

	public void clickHomeAway()throws PageException{
		this.click(ExpediaField.HomeAway);
	}

	public void clickTrover()throws PageException{
		this.click(ExpediaField.Trover);
	}

	public void clickWwwCaaCoUk()throws PageException{
		this.click(ExpediaField.WwwCaaCoUk);
	}

	public void clickWwwFsaGovUkRegister()throws PageException{
		this.click(ExpediaField.WwwFsaGovUkRegister);
	}

	public void clickExpediaInc()throws PageException{
		this.click(ExpediaField.ExpediaInc);
	}

	public void clickBannerLinkTakemeToLocal()throws PageException{
		this.click(ExpediaField.BannerLinkTakemeToLocal);
	}

	public void clickGcMadBannerLink()throws PageException{
		this.click(ExpediaField.GcMadBannerLink);
	}

	public void clickHeaderLogo()throws PageException{
		this.click(ExpediaField.HeaderLogo);
	}

	public void clickHeaderHistorySm()throws PageException{
		this.click(ExpediaField.HeaderHistorySm);
	}

	public void clickAccountMenuMyaccount()throws PageException{
		this.click(ExpediaField.AccountMenuMyaccount);
	}

	public void clickAccountMenuItineraries()throws PageException{
		this.click(ExpediaField.AccountMenuItineraries);
	}

	public void clickAccountMenuRewards()throws PageException{
		this.click(ExpediaField.AccountMenuRewards);
	}

	public void clickAccountMenuSignout()throws PageException{
		this.click(ExpediaField.AccountMenuSignout);
	}

	public void clickSubMenuHeaderShopHome()throws PageException{
		this.click(ExpediaField.SubMenuHeaderShopHome);
	}

	public void clickSubMenuHeaderShopHotel()throws PageException{
		this.click(ExpediaField.SubMenuHeaderShopHotel);
	}

	public void clickSubMenuHeaderShopFlight()throws PageException{
		this.click(ExpediaField.SubMenuHeaderShopFlight);
	}

	public void clickSubMenuHeaderShopPackage()throws PageException{
		this.click(ExpediaField.SubMenuHeaderShopPackage);
	}

	public void clickSubMenuHeaderShopCar()throws PageException{
		this.click(ExpediaField.SubMenuHeaderShopCar);
	}

	public void clickSubMenuHeaderShopRail()throws PageException{
		this.click(ExpediaField.SubMenuHeaderShopRail);
	}

	public void clickSubMenuHeaderShopVacationRental()throws PageException{
		this.click(ExpediaField.SubMenuHeaderShopVacationRental);
	}

	public void clickSubMenuHeaderShopCollections()throws PageException{
		this.click(ExpediaField.SubMenuHeaderShopCollections);
	}

	public void clickSubMenuHeaderShopActivity()throws PageException{
		this.click(ExpediaField.SubMenuHeaderShopActivity);
	}

	public void clickSubMenuHeaderShopLastminute()throws PageException{
		this.click(ExpediaField.SubMenuHeaderShopLastminute);
	}

	public void clickSubMenuHeaderShopBeach()throws PageException{
		this.click(ExpediaField.SubMenuHeaderShopBeach);
	}

	public void clickSubMenuHeaderShopDeals()throws PageException{
		this.click(ExpediaField.SubMenuHeaderShopDeals);
	}

	public void clickSubMenuHeaderShopCitybreaks()throws PageException{
		this.click(ExpediaField.SubMenuHeaderShopCitybreaks);
	}

	public void clickSubMenuHeaderShopRewards()throws PageException{
		this.click(ExpediaField.SubMenuHeaderShopRewards);
	}

	public void clickHeaderAccountSignin()throws PageException{
		this.click(ExpediaField.HeaderAccountSignin);
	}

	public void clickHeaderAccountRegister()throws PageException{
		this.click(ExpediaField.HeaderAccountRegister);
	}

	public void clickAccountMyaccount()throws PageException{
		this.click(ExpediaField.AccountMyaccount);
	}

	public void clickAccountSignout()throws PageException{
		this.click(ExpediaField.AccountSignout);
	}

	public void clickIdentifiedAccountSignout()throws PageException{
		this.click(ExpediaField.IdentifiedAccountSignout);
	}

	public void clickIdentifiedAccountSignoutV2()throws PageException{
		this.click(ExpediaField.IdentifiedAccountSignoutV2);
	}

	public void clickHeaderHistory()throws PageException{
		this.click(ExpediaField.HeaderHistory);
	}

	public void clickTravellertoolsTrip()throws PageException{
		this.click(ExpediaField.TravellertoolsTrip);
	}

	public void clickCheckinTrip()throws PageException{
		this.click(ExpediaField.CheckinTrip);
	}

	public void clickManagemyhotelTrip()throws PageException{
		this.click(ExpediaField.ManagemyhotelTrip);
	}

	public void clickVisaTrip()throws PageException{
		this.click(ExpediaField.VisaTrip);
	}

	public void clickSupportCs()throws PageException{
		this.click(ExpediaField.SupportCs);
	}

	public void clickSupportFeedback()throws PageException{
		this.click(ExpediaField.SupportFeedback);
	}

	public void clickPrimaryHeaderHome()throws PageException{
		this.click(ExpediaField.PrimaryHeaderHome);
	}

	public void clickPrimaryHeaderHotel()throws PageException{
		this.click(ExpediaField.PrimaryHeaderHotel);
	}

	public void clickPrimaryHeaderFlight()throws PageException{
		this.click(ExpediaField.PrimaryHeaderFlight);
	}

	public void clickPrimaryHeaderPackage()throws PageException{
		this.click(ExpediaField.PrimaryHeaderPackage);
	}

	public void clickPrimaryHeaderCar()throws PageException{
		this.click(ExpediaField.PrimaryHeaderCar);
	}

	public void clickPrimaryHeaderRail()throws PageException{
		this.click(ExpediaField.PrimaryHeaderRail);
	}

	public void clickPrimaryHeaderVacationRental()throws PageException{
		this.click(ExpediaField.PrimaryHeaderVacationRental);
	}

	public void clickPrimaryHeaderCollections()throws PageException{
		this.click(ExpediaField.PrimaryHeaderCollections);
	}

	public void clickPrimaryHeaderActivity()throws PageException{
		this.click(ExpediaField.PrimaryHeaderActivity);
	}

	public void clickPrimaryHeaderLastminute()throws PageException{
		this.click(ExpediaField.PrimaryHeaderLastminute);
	}

	public void clickPrimaryHeaderBeach()throws PageException{
		this.click(ExpediaField.PrimaryHeaderBeach);
	}

	public void clickPrimaryHeaderDeals()throws PageException{
		this.click(ExpediaField.PrimaryHeaderDeals);
	}

	public void clickPrimaryHeaderCitybreaks()throws PageException{
		this.click(ExpediaField.PrimaryHeaderCitybreaks);
	}

	public void clickPrimaryHeaderRewards()throws PageException{
		this.click(ExpediaField.PrimaryHeaderRewards);
	}

	public void clickAllInHeaderShopMenu()throws PageException{
		this.click(ExpediaField.AllInHeaderShopMenu);
	}

	public void clickHeaderAccountLastminuteMoreMenu()throws PageException{
		this.click(ExpediaField.HeaderAccountLastminuteMoreMenu);
	}

	public void clickHeaderAccountBeachMoreMenu()throws PageException{
		this.click(ExpediaField.HeaderAccountBeachMoreMenu);
	}

	public void clickHeaderAccountDealsMoreMenu()throws PageException{
		this.click(ExpediaField.HeaderAccountDealsMoreMenu);
	}

	public void clickHeaderAccountCitybreaksMoreMenu()throws PageException{
		this.click(ExpediaField.HeaderAccountCitybreaksMoreMenu);
	}

	public void clickHeaderAccountRewardsMoreMenu()throws PageException{
		this.click(ExpediaField.HeaderAccountRewardsMoreMenu);
	}

	public void clickGssGoToForgotPassword()throws PageException{
		this.click(ExpediaField.GssGoToForgotPassword);
	}

	public void clickAddFlightLegHpFlight()throws PageException{
		this.click(ExpediaField.AddFlightLegHpFlight);
	}

	public void clickFlightChildrenHelpHpFlight()throws PageException{
		this.click(ExpediaField.FlightChildrenHelpHpFlight);
	}

	public void clickFlightAdvancedOptionsHpFlight()throws PageException{
		this.click(ExpediaField.FlightAdvancedOptionsHpFlight);
	}

	public void clickDriverAgeHelpDefault()throws PageException{
		this.click(ExpediaField.DriverAgeHelpDefault);
	}

	public void clickHotelAddFlightHpHotel()throws PageException{
		this.click(ExpediaField.HotelAddFlightHpHotel);
	}

	public void clickHotelAddCarHpHotel()throws PageException{
		this.click(ExpediaField.HotelAddCarHpHotel);
	}

	public void clickHotelFlightChildrenHelpHpHotel()throws PageException{
		this.click(ExpediaField.HotelFlightChildrenHelpHpHotel);
	}

	public void clickPackageAdvancedOptionsHpPackage()throws PageException{
		this.click(ExpediaField.PackageAdvancedOptionsHpPackage);
	}

	public void clickPackageFlightChildrenHelpHpPackage()throws PageException{
		this.click(ExpediaField.PackageFlightChildrenHelpHpPackage);
	}

	public void clickAddRailCardHpRail()throws PageException{
		this.click(ExpediaField.AddRailCardHpRail);
	}

	public void clickFeefoContainer()throws PageException{
		this.click(ExpediaField.FeefoContainer);
	}

	public void clickReasonsToBelieveContainer()throws PageException{
		this.click(ExpediaField.ReasonsToBelieveContainer);
	}

	public void clickRvContainer()throws PageException{
		this.click(ExpediaField.RvContainer);
	}

	public void clickTopdestContainer()throws PageException{
		this.click(ExpediaField.TopdestContainer);
	}

	public void clickAddHotelLink()throws PageException{
		this.click(ExpediaField.AddHotelLink);
	}

}
