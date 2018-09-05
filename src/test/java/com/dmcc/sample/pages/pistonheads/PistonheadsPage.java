package com.dmcc.sample.pages.pistonheads;

import com.dmcc.pagegen.exceptions.PageException;
import com.dmcc.sample.pages.pistonheads.PistonheadsField;
import com.dmcc.pagegen.page.mccarterp.McCarterPage;

public class PistonheadsPage extends McCarterPage{

private final String url="https://www.pistonheads.com";
private final String rRoot="../pgenexamples/src/test/resources";

	public PistonheadsPage navigate()throws PageException {
		this.setResourcesRoot(rRoot);
		this.navigate(url);
		return this;
	}

	public void setQ(final String value) throws PageException{
		this.setValue(PistonheadsField.Q, value);
	}

	public void clickQ()throws PageException{
		this.click(PistonheadsField.Q);
	}

	public void setCarMakesDropdown(final CarMakesDropdownEnum value) throws PageException{
		this.setValue(PistonheadsField.CarMakesDropdown, value.toString());
	}

	public void clickCarMakesDropdown()throws PageException{
		this.click(PistonheadsField.CarMakesDropdown);
	}

	public void setCarModelsDropdown(final CarModelsDropdownEnum value) throws PageException{
		this.setValue(PistonheadsField.CarModelsDropdown, value.toString());
	}

	public void clickCarModelsDropdown()throws PageException{
		this.click(PistonheadsField.CarModelsDropdown);
	}

	public void setCarMaxPrice(final CarMaxPriceEnum value) throws PageException{
		this.setValue(PistonheadsField.CarMaxPrice, value.toString());
	}

	public void clickCarMaxPrice()throws PageException{
		this.click(PistonheadsField.CarMaxPrice);
	}

	public void setBikeMakesDropdown(final BikeMakesDropdownEnum value) throws PageException{
		this.setValue(PistonheadsField.BikeMakesDropdown, value.toString());
	}

	public void clickBikeMakesDropdown()throws PageException{
		this.click(PistonheadsField.BikeMakesDropdown);
	}

	public void setBikeModelsDropdown(final BikeModelsDropdownEnum value) throws PageException{
		this.setValue(PistonheadsField.BikeModelsDropdown, value.toString());
	}

	public void clickBikeModelsDropdown()throws PageException{
		this.click(PistonheadsField.BikeModelsDropdown);
	}

	public void setBikeMaxPrice(final BikeMaxPriceEnum value) throws PageException{
		this.setValue(PistonheadsField.BikeMaxPrice, value.toString());
	}

	public void clickBikeMaxPrice()throws PageException{
		this.click(PistonheadsField.BikeMaxPrice);
	}

	public void setPartMakesDropdown(final PartMakesDropdownEnum value) throws PageException{
		this.setValue(PistonheadsField.PartMakesDropdown, value.toString());
	}

	public void clickPartMakesDropdown()throws PageException{
		this.click(PistonheadsField.PartMakesDropdown);
	}

	public void setPartModelsDropdown(final PartModelsDropdownEnum value) throws PageException{
		this.setValue(PistonheadsField.PartModelsDropdown, value.toString());
	}

	public void clickPartModelsDropdown()throws PageException{
		this.click(PistonheadsField.PartModelsDropdown);
	}

	public void setPartMaxPrice(final PartMaxPriceEnum value) throws PageException{
		this.setValue(PistonheadsField.PartMaxPrice, value.toString());
	}

	public void clickPartMaxPrice()throws PageException{
		this.click(PistonheadsField.PartMaxPrice);
	}

	public void clickPistonheads()throws PageException{
		this.click(PistonheadsField.Pistonheads);
	}

	public void clickNews()throws PageException{
		this.click(PistonheadsField.News);
	}

	public void clickGeneralNews()throws PageException{
		this.click(PistonheadsField.GeneralNews);
	}

	public void clickAmericanCars()throws PageException{
		this.click(PistonheadsField.AmericanCars);
	}

	public void clickBritishCars()throws PageException{
		this.click(PistonheadsField.BritishCars);
	}

	public void clickEuroCars()throws PageException{
		this.click(PistonheadsField.EuroCars);
	}

	public void clickGermanCars()throws PageException{
		this.click(PistonheadsField.GermanCars);
	}

	public void clickJapaneseCars()throws PageException{
		this.click(PistonheadsField.JapaneseCars);
	}

	public void clickMotorsport()throws PageException{
		this.click(PistonheadsField.Motorsport);
	}

	public void clickRegulars()throws PageException{
		this.click(PistonheadsField.Regulars);
	}

	public void clickShedOfTheWeek()throws PageException{
		this.click(PistonheadsField.ShedOfTheWeek);
	}

	public void clickSpottedYouKnowYouWantTo()throws PageException{
		this.click(PistonheadsField.SpottedYouKnowYouWantTo);
	}

	public void click100KGarage()throws PageException{
		this.click(PistonheadsField.VALUE_OF_100KGarage);
	}

	public void clickPHFleet()throws PageException{
		this.click(PistonheadsField.PHFleet);
	}

	public void clickPHCarpool()throws PageException{
		this.click(PistonheadsField.PHCarpool);
	}

	public void clickPHBlog()throws PageException{
		this.click(PistonheadsField.PHBlog);
	}

	public void clickPicOfTheWeek()throws PageException{
		this.click(PistonheadsField.PicOfTheWeek);
	}

	public void clickFeatures()throws PageException{
		this.click(PistonheadsField.Features);
	}

	public void clickPHHeroes()throws PageException{
		this.click(PistonheadsField.PHHeroes);
	}

	public void clickPHBuyingGuides()throws PageException{
		this.click(PistonheadsField.PHBuyingGuides);
	}

	public void clickMyDreamDrive()throws PageException{
		this.click(PistonheadsField.MyDreamDrive);
	}

	public void clickPH2()throws PageException{
		this.click(PistonheadsField.PH2);
	}

	public void clickFinanceAmpInsuranceAdvice()throws PageException{
		this.click(PistonheadsField.FinanceAmpInsuranceAdvice);
	}

	public void clickReviews()throws PageException{
		this.click(PistonheadsField.Reviews);
	}

	public void clickAstonMartin()throws PageException{
		this.click(PistonheadsField.AstonMartin);
	}

	public void clickAudi()throws PageException{
		this.click(PistonheadsField.Audi);
	}

	public void clickBMW()throws PageException{
		this.click(PistonheadsField.BMW);
	}

	public void clickFerrari()throws PageException{
		this.click(PistonheadsField.Ferrari);
	}

	public void clickFord()throws PageException{
		this.click(PistonheadsField.Ford);
	}

	public void clickHonda()throws PageException{
		this.click(PistonheadsField.Honda);
	}

	public void clickJaguar()throws PageException{
		this.click(PistonheadsField.Jaguar);
	}

	public void clickLotus()throws PageException{
		this.click(PistonheadsField.Lotus);
	}

	public void clickMercedes()throws PageException{
		this.click(PistonheadsField.Mercedes);
	}

	public void clickNissan()throws PageException{
		this.click(PistonheadsField.Nissan);
	}

	public void clickPorsche()throws PageException{
		this.click(PistonheadsField.Porsche);
	}

	public void clickSkoda()throws PageException{
		this.click(PistonheadsField.Skoda);
	}

	public void clickBuy()throws PageException{
		this.click(PistonheadsField.Buy);
	}

	public void clickUsedCars()throws PageException{
		this.click(PistonheadsField.UsedCars);
	}

	public void clickMotorbikes()throws PageException{
		this.click(PistonheadsField.Motorbikes);
	}

	public void clickBigStuff()throws PageException{
		this.click(PistonheadsField.BigStuff);
	}

	public void clickPartsAmpPlates()throws PageException{
		this.click(PistonheadsField.PartsAmpPlates);
	}

	public void clickNonMotoring()throws PageException{
		this.click(PistonheadsField.NonMotoring);
	}

	public void clickLast24Hours()throws PageException{
		this.click(PistonheadsField.Last24Hours);
	}

	public void clickNearlyNew()throws PageException{
		this.click(PistonheadsField.NearlyNew);
	}

	public void clickSOTW()throws PageException{
		this.click(PistonheadsField.SOTW);
	}

	public void clickBargainBarges()throws PageException{
		this.click(PistonheadsField.BargainBarges);
	}

	public void clickPrimeBritishBeef()throws PageException{
		this.click(PistonheadsField.PrimeBritishBeef);
	}

	public void clickMyClassifiedsAccount()throws PageException{
		this.click(PistonheadsField.MyClassifiedsAccount);
	}

	public void clickMySavedSearches()throws PageException{
		this.click(PistonheadsField.MySavedSearches);
	}

	public void clickMyBookmarks()throws PageException{
		this.click(PistonheadsField.MyBookmarks);
	}

	public void clickMyAdverts()throws PageException{
		this.click(PistonheadsField.MyAdverts);
	}

	public void clickBrowseCarsForSale()throws PageException{
		this.click(PistonheadsField.BrowseCarsForSale);
	}

	public void clickSell()throws PageException{
		this.click(PistonheadsField.Sell);
	}

	public void clickSellMyCar()throws PageException{
		this.click(PistonheadsField.SellMyCar);
	}

	public void clickSellMyBike()throws PageException{
		this.click(PistonheadsField.SellMyBike);
	}

	public void clickSellMyBigStuff()throws PageException{
		this.click(PistonheadsField.SellMyBigStuff);
	}

	public void clickSellMotorsport()throws PageException{
		this.click(PistonheadsField.SellMotorsport);
	}

	public void clickSellPartsAmpPlates()throws PageException{
		this.click(PistonheadsField.SellPartsAmpPlates);
	}

	public void clickSellNonMotoring()throws PageException{
		this.click(PistonheadsField.SellNonMotoring);
	}

	public void clickMyFavourites()throws PageException{
		this.click(PistonheadsField.MyFavourites);
	}

	public void clickCreateMyAdvert()throws PageException{
		this.click(PistonheadsField.CreateMyAdvert);
	}

	public void clickForums()throws PageException{
		this.click(PistonheadsField.Forums);
	}

	public void clickForumHome()throws PageException{
		this.click(PistonheadsField.ForumHome);
	}

	public void clickGeneralGassing()throws PageException{
		this.click(PistonheadsField.GeneralGassing);
	}

	public void clickEvents()throws PageException{
		this.click(PistonheadsField.Events);
	}

	public void clickThePieAmpPiston()throws PageException{
		this.click(PistonheadsField.ThePieAmpPiston);
	}

	public void clickSupercars()throws PageException{
		this.click(PistonheadsField.Supercars);
	}

	public void clickTVR()throws PageException{
		this.click(PistonheadsField.TVR);
	}

	public void clickTheLounge()throws PageException{
		this.click(PistonheadsField.TheLounge);
	}

	public void clickMyGarage()throws PageException{
		this.click(PistonheadsField.MyGarage);
	}

	public void clickMyStuff()throws PageException{
		this.click(PistonheadsField.MyStuff);
	}

	public void clickMyPreferences()throws PageException{
		this.click(PistonheadsField.MyPreferences);
	}

	public void clickMyProfile()throws PageException{
		this.click(PistonheadsField.MyProfile);
	}

	public void clickMyMates()throws PageException{
		this.click(PistonheadsField.MyMates);
	}

	public void clickWhatSNew()throws PageException{
		this.click(PistonheadsField.WhatSNew);
	}

	public void clickMemberCars()throws PageException{
		this.click(PistonheadsField.MemberCars);
	}

	public void clickMemberDirectory()throws PageException{
		this.click(PistonheadsField.MemberDirectory);
	}

	public void clickMemberMap()throws PageException{
		this.click(PistonheadsField.MemberMap);
	}

	public void clickMemberBusinesses()throws PageException{
		this.click(PistonheadsField.MemberBusinesses);
	}

	public void clickThisMonth()throws PageException{
		this.click(PistonheadsField.ThisMonth);
	}

	public void clickPHEvents()throws PageException{
		this.click(PistonheadsField.PHEvents);
	}

	public void clickSuggestEvent()throws PageException{
		this.click(PistonheadsField.SuggestEvent);
	}

	public void clickServices()throws PageException{
		this.click(PistonheadsField.Services);
	}

	public void clickHPICarCheck()throws PageException{
		this.click(PistonheadsField.HPICarCheck);
	}

	public void clickCarFinance()throws PageException{
		this.click(PistonheadsField.CarFinance);
	}

	public void clickCarWarranties()throws PageException{
		this.click(PistonheadsField.CarWarranties);
	}

	public void clickCarLeasing()throws PageException{
		this.click(PistonheadsField.CarLeasing);
	}

	public void clickCarInsurance()throws PageException{
		this.click(PistonheadsField.CarInsurance);
	}

	public void clickGapInsurance()throws PageException{
		this.click(PistonheadsField.GapInsurance);
	}

	public void clickCarServicing()throws PageException{
		this.click(PistonheadsField.CarServicing);
	}

	public void clickTootle()throws PageException{
		this.click(PistonheadsField.Tootle);
	}

	public void clickPHShop()throws PageException{
		this.click(PistonheadsField.PHShop);
	}

	public void clickShopHome()throws PageException{
		this.click(PistonheadsField.ShopHome);
	}

	public void clickAdultTShirts()throws PageException{
		this.click(PistonheadsField.AdultTShirts);
	}

	public void clickKidsTShirts()throws PageException{
		this.click(PistonheadsField.KidsTShirts);
	}

	public void clickHoodies()throws PageException{
		this.click(PistonheadsField.Hoodies);
	}

	public void clickMugs()throws PageException{
		this.click(PistonheadsField.Mugs);
	}

	public void clickStickers()throws PageException{
		this.click(PistonheadsField.Stickers);
	}

	public void clickMyAccount()throws PageException{
		this.click(PistonheadsField.MyAccount);
	}

	public void clickLogin()throws PageException{
		this.click(PistonheadsField.Login);
	}

	public void clickRegister()throws PageException{
		this.click(PistonheadsField.Register);
	}

	public void clickCookiesPolicy()throws PageException{
		this.click(PistonheadsField.CookiesPolicy);
	}

	public void clickDeHavillandTigerMothPHHeroes()throws PageException{
		this.click(PistonheadsField.DeHavillandTigerMothPHHeroes);
	}

	public void clickDafyddWood()throws PageException{
		this.click(PistonheadsField.DafyddWood);
	}

	public void click28()throws PageException{
		this.click(PistonheadsField.VALUE_OF_28);
	}

	public void clickHyundaiI30NPerformanceGets320hp()throws PageException{
		this.click(PistonheadsField.HyundaiI30NPerformanceGets320hp);
	}

	public void clickMattBird()throws PageException{
		this.click(PistonheadsField.MattBird);
	}

	public void clickPolestarOffersRearBiasedUpgradeToAWDVolvos()throws PageException{
		this.click(PistonheadsField.PolestarOffersRearBiasedUpgradeToAWDVolvos);
	}

	public void clickSamSheehan()throws PageException{
		this.click(PistonheadsField.SamSheehan);
	}

	public void clickBMW1SeriesMCoupePHUsedBuyingGuide()throws PageException{
		this.click(PistonheadsField.BMW1SeriesMCoupePHUsedBuyingGuide);
	}

	public void clickAlisdairsuttie()throws PageException{
		this.click(PistonheadsField.Alisdairsuttie);
	}

	public void clickMitsubishiPajeroEvolutionSpotted()throws PageException{
		this.click(PistonheadsField.MitsubishiPajeroEvolutionSpotted);
	}

	public void clickSpottedYKYWT()throws PageException{
		this.click(PistonheadsField.SpottedYKYWT);
	}

	public void clickIfStack2HelpersTitleStack2Stack2CallDepth0HashDataDataElseStack2Depth0TitleStack2TypeofStack2FunctionTypeStack2ApplyDepth0Stack2BufferEscapeExpressionStack2()throws PageException{
		this.click(PistonheadsField.IfStack2HelpersTitleStack2Stack2CallDepth0HashDataDataElseStack2Depth0TitleStack2TypeofStack2FunctionTypeStack2ApplyDepth0Stack2BufferEscapeExpressionStack2);
	}

	public void clickNEscapeExpressionStack1Stack1Depth0SponsorStack1=Null||Stack1FalseStack1Stack1NameTypeofStack1FunctionTypeStack1ApplyDepth0Stack1N()throws PageException{
		this.click(PistonheadsField.NEscapeExpressionStack1Stack1Depth0SponsorStack1Null||Stack1FalseStack1Stack1NameTypeofStack1FunctionTypeStack1ApplyDepth0Stack1N);
	}

	public void clickMSORevealsTrackTheme720S()throws PageException{
		this.click(PistonheadsField.MSORevealsTrackTheme720S);
	}

	public void clickBrabusLaunches600hpGLC63()throws PageException{
		this.click(PistonheadsField.BrabusLaunches600hpGLC63);
	}

	public void clickBMW8SeriesGranCoupeFirstLook()throws PageException{
		this.click(PistonheadsField.BMW8SeriesGranCoupeFirstLook);
	}

	public void clickJaguarXJRSpotted()throws PageException{
		this.click(PistonheadsField.JaguarXJRSpotted);
	}

	public void clickHyundaiI30NToGetRevisedSuspensionIn2019()throws PageException{
		this.click(PistonheadsField.HyundaiI30NToGetRevisedSuspensionIn2019);
	}

	public void clickGeneral()throws PageException{
		this.click(PistonheadsField.General);
	}

	public void clickWhatIsElectronicThrottleControlPHExplains()throws PageException{
		this.click(PistonheadsField.WhatIsElectronicThrottleControlPHExplains);
	}

	public void clickLewisKingston()throws PageException{
		this.click(PistonheadsField.LewisKingston);
	}

	public void clickPriorConvictionsSolvingLotus()throws PageException{
		this.click(PistonheadsField.PriorConvictionsSolvingLotus);
	}

	public void clickMattPrior()throws PageException{
		this.click(PistonheadsField.MattPrior);
	}

	public void click1968ChallengerIISetsPistonDrivenSpeedRecord()throws PageException{
		this.click(PistonheadsField.VALUE_OF_1968ChallengerIISetsPistonDrivenSpeedRecord);
	}

	public void clickPHOriginsVariableCompressionRatioTechnology()throws PageException{
		this.click(PistonheadsField.PHOriginsVariableCompressionRatioTechnology);
	}

	public void clickMorganAndPashleyCyclesTeamUp()throws PageException{
		this.click(PistonheadsField.MorganAndPashleyCyclesTeamUp);
	}

	public void clickMustangBullittEditionGetsTheSteedaTreatment()throws PageException{
		this.click(PistonheadsField.MustangBullittEditionGetsTheSteedaTreatment);
	}

	public void clickMoreNewsStories()throws PageException{
		this.click(PistonheadsField.MoreNewsStories);
	}

	public void clickResetFilters()throws PageException{
		this.click(PistonheadsField.ResetFilters);
	}

	public void clickViewAllForums()throws PageException{
		this.click(PistonheadsField.ViewAllForums);
	}

	public void clickTermsAmpConditions()throws PageException{
		this.click(PistonheadsField.TermsAmpConditions);
	}

	public void clickPrivacyPolicy()throws PageException{
		this.click(PistonheadsField.PrivacyPolicy);
	}

	public void clickContactUs()throws PageException{
		this.click(PistonheadsField.ContactUs);
	}

	public void clickUsedCarsByLocation()throws PageException{
		this.click(PistonheadsField.UsedCarsByLocation);
	}

	public void clickAllUsedCarsMakes()throws PageException{
		this.click(PistonheadsField.AllUsedCarsMakes);
	}

	public void clickEditorialComplaint()throws PageException{
		this.click(PistonheadsField.EditorialComplaint);
	}

	public void clickAdvertisingPreferences()throws PageException{
		this.click(PistonheadsField.AdvertisingPreferences);
	}

	public void clickCarReset()throws PageException{
		this.click(PistonheadsField.CarReset);
	}

	public void clickBikeReset()throws PageException{
		this.click(PistonheadsField.BikeReset);
	}

	public void clickPartReset()throws PageException{
		this.click(PistonheadsField.PartReset);
	}

}
