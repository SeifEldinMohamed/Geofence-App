package com.seif.geofenceapp

/** Video 4 : Geofence Api limitations **/

// from api 29 and above there are changes when we talking about background location as we can't use background location constantly for our application
// to use geofence api in full time then we have to :
// You can now submit your app for feedback on location in the background access by completing the Location permissions declaration form in Play Console.
// Your app should not request access to location in the background unless it’s required. If your app requests access to location in the background but
// it’s not critical to the app’s core functionality, you must remove it from your app and/or implement location access in the foreground,
// such as when your app’s activity is visible to users. You can find details on policy compliant implementation below.
// the number of geofence which we can create in our app for single user is 100

/** Video 5 : About places api **/
// (paid services) we have 200$ free credit "we must have a billing account"
// The Places SDK for Android allows you to build location-aware apps that respond contextually
// to the local businesses and other places near the user's device. This means you can build rich apps
// based on places that mean something to the user, to complement the straightforward
// geographic-based services offered by the Android location services.
//
// The following interfaces provide the primary entry points to the Places SDK for Android:
//
// - Places: provides programmatic access to Google's database of local place and business information, as well as the device's current place.
// - Autocomplete: provides pre-made widgets to return place predictions in response to user search queries.

// A place is defined as a physical space that has a name. Another way of thinking about a place is that
// it's anything you can find on a map. Examples include local businesses, points of interest, and geographic locations.
// In the API, a place is represented by the Place interface. It includes information such as the name of the place and
// its address, geographical location, place ID, phone number, place type, website URL, and more.

// NOTE:Whenever your app displays information about places sourced from the Places SDK for Android, the app must also show all relevant attributions that are returned by the API.
//
// API overview
// Help your customers explore where they are and what’s around them:
//
// Place Autocomplete automatically fills in the name and/or address of a place as users type.
// Current Place returns a list of places where the user’s device is last known to be located along with an indication of the relative likelihood for each place.
// Place Details return and display more detailed information about a place.
// Place Photos returns high-quality images of a place.
// Place IDs stores the unique ID for one or more places for retrieval of place information on demand.

/** Video 6 : Places iDs **/
// ⚫  Place IDs uniquely identify a place in the Google Places database and on Google Maps. Place IDs are accepted in requests to the following Maps APIs:
// - Retrieving an address for a Place ID in the Geocoding API web service and Geocoding Service, Maps JavaScript API.
// - Specifying origin, destination and intermediate waypoints in the Directions API web service and Directions Service, Maps JavaScript API.
// - Specifying origins and destinations in the Distance Matrix API web service and Distance Matrix Service, Maps JavaScript API.
// - Retrieving Place Details in Places API web service, Places SDK for Android, Places SDK for iOS, and Places Library, JavaScript API.
// - Using Place ID parameters in Maps Embed API.
// - Retrieving search queries in Maps URLs.
// - Displaying speed limits in Roads API.
// - Finding and styling boundary polygons in Data-driven styling.
//
// A place ID is a textual identifier that uniquely identifies a place. The length of the identifier may vary (there is no maximum length for Place IDs).
// Place IDs are available for most locations, including businesses, landmarks, parks, and intersections. It is possible for the same place or location to have multiple different place IDs. Place IDs may change over time.
//
//You can use the same place ID across the Places API and a number of Google Maps Platform APIs. For example, you can use the same place ID to reference a place in the Places API, the Maps JavaScript API, the Geocoding API, the Maps Embed API and the Roads API.


/** Video 7 : Places Types **/
// This page lists the supported values for the types property.
//
// ⚫ Table 1 lists the types that are supported for place searches, and can be returned with Place details results, and as part of autocomplete place predictions.
// ⚫ Table 2 lists additional types that can be returned with Place details results, and as part of autocomplete place predictions.
// ⚫ Table 3 lists types you can use in place autocomplete requests.

// ⚫ Table 1: Place types
// The Place type values in Table 1 are used in the following ways:
//
// As part of a Place details response. The request must specify the appropriate "types" data field.
// As part of an Autocomplete place prediction. For more information on the rules for using these values, see Places Autocomplete.
// In the type parameter for place searches (Places API only),
// to restrict the results to places matching the specified type.
// accounting
// airport
// amusement_park
// aquarium
// art_gallery
// atm
// bakery
// bank
// bar
// beauty_salon
// bicycle_store
// book_store
// bowling_alley
// bus_station
// cafe
// campground
// car_dealer
// car_rental
// car_repair
// car_wash
// casino
// cemetery
// church
// city_hall
// clothing_store
// convenience_store
// courthouse
// dentist
// department_store
// doctor
// drugstore
// electrician
// electronics_store
// embassy
// fire_station
// florist
// funeral_home
// furniture_store
// gas_station
// gym
// hair_care
// hardware_store
// hindu_temple
// home_goods_store
// hospital
// insurance_agency
// jewelry_store
// laundry
// lawyer
// library
// light_rail_station
// liquor_store
// local_government_office
// locksmith
// lodging
// meal_delivery
// meal_takeaway
// mosque
// movie_rental
// movie_theater
// moving_company
// museum
// night_club
// painter
// park
// parking
// pet_store
// pharmacy
// physiotherapist
// plumber
// police
// post_office
// primary_school
// real_estate_agency
// restaurant
// roofing_contractor
// rv_park
// school
// secondary_school
// shoe_store
// shopping_mall
// spa
// stadium
// storage
// store
// subway_station
// supermarket
// synagogue
// taxi_stand
// tourist_attraction
// train_station
// transit_station
// travel_agency
// university
// veterinary_care
// zoo

// ⚫  Table 2: Additional types returned by the Places service
// The Place type values in Table 2 are used in the following ways:
//
// As part of the result of a Place details request (for example, a call to fetchPlace()), or anywhere a Place result is returned. The request must specify the appropriate "types" data field.
// As part of an Autocomplete place prediction. For more information on the rules for using these values, see Places Autocomplete.
// To denote address components.
// For more details on these types, refer to Address Types.
//
// Note: The types below are not supported in the type filter of a place search.
// administrative_area_level_1
// administrative_area_level_2
// administrative_area_level_3
// administrative_area_level_4
// administrative_area_level_5
// administrative_area_level_6
// administrative_area_level_7
// archipelago
// colloquial_area
// continent
// country
// establishment
// finance
// floor
// food
// general_contractor
// geocode
// health
// intersection
// landmark
// locality
// natural_feature
// neighborhood
// place_of_worship
// plus_code
// point_of_interest
// political
// post_box
// postal_code
// postal_code_prefix
// postal_code_suffix
// postal_town
// premise
// room
// route
// street_address
// street_number
// sublocality
// sublocality_level_1
// sublocality_level_2
// sublocality_level_3
// sublocality_level_4
// sublocality_level_5
// subpremise
// town_square

// ⚫  Table 3: Type collections supported in Place Autocomplete requests
// Use the Place type values in Table 3, or the values in Table 1 and Table 2, as part of a Place Autocomplete request to restrict the results to a specific type.
//
// Only a single type from Table 3 is allowed in the request. If you do specify a value from Table 3, you cannot specify a value from Table 1 or Table 2.
//
// For more information on the rules for using these values, see Places Autocomplete.
//
// ⚫ The supported types are:
//
// geocode instructs the Place Autocomplete service to return only geocoding results, rather than business results. Generally, you use this request to disambiguate results where the location specified may be indeterminate.
// address instructs the Place Autocomplete service to return only geocoding results with a precise address. Generally, you use this request when you know the user will be looking for a fully specified address.
// establishment instructs the Place Autocomplete service to return only business results.
// The (regions) type collection instructs the Places service to return any result matching the following types:
// locality
// sublocality
// postal_code
// country
// administrative_area_level_1
// administrative_area_level_2
// The (cities) type collection instructs the Places service to return results that match locality or administrative_area_level_3.

// ⚫ Places Data Field: "https://developers.google.com/maps/documentation/places/web-service/place-data-fields"
// Place data fields define the types of Place data to return when requesting Place Details.
// This page lists all place data fields, and explains how they are supported for each API/SDK (support for place fields varies by platform and/or feature).

// For more information about how Place Details requests are billed, see Usage and Billing.
// The following table lists all supported place data field values by pricing tier, and platform.

// Important: Because place data results cannot be empty, only place results with data are returned. For example,
// if a requested place has no photos, the photos field will not be present in the result.

// ⚫ Basic Data:
// Address Component ->     Place.Field.ADDRESS_COMPONENTS
// Business Status ->       Place.Field.BUSINESS_STATUS
// Formatted Address ->     Place.Field.ADDRESS
// Viewport ->              Place.Field.VIEWPORT
// Location ->              Place.Field.LAT_LNG
// Icon Mask Base URI ->    Place.Field.ICON_URL
// Icon Background Color -> Place.Field.ICON_BACKGROUND_COLOR
// Name ->                  Place.Field.NAME
// Photo ->                 Place.Field.PHOTO_METADATAS
// Place ID ->              Place.Field.ID
// Plus Code ->             Place.Field.PLUS_CODE
// Type ->                  Place.Field.TYPES
// UTC Offset ->            Place.Field.UTC_OFFSET

// ⚫ Contact Data Fields:
// International Phone Number -> Place.Field.PHONE_NUMBER
// Opening Hours ->              Place.Field.OPENING_HOURS
// Website ->                    Place.Field.WEBSITE_URI

// ⚫ Atmosphere Data Fields:
// Price Level -> 	        Place.Field.PRICE_LEVEL
// Rating -> 		        Place.Field.RATING
// User Ratings Total -> 	Place.Field.USER_RATINGS_TOTAL

// Places API fields support :
// - Place Search, Nearby Search, and Text Search requests all return a subset of the fields that are returned by Place Details requests.
//   These methods do NOT return the following fields:
//
// address_component
// adr_address
// formatted_phone_number
// international_phone_number
// reviews
// type
// url
// utc_offset
// vicinity
// website
// - To return one or more of these data fields for a place, make a Place Details request,
//   pass a place ID, and specify which fields to return.

// Place icons indicate the various types of places (for example coffee shops, libraries, and museums).
// You can request URLs for icons in PNG or SVG format, as well as the corresponding icon background color,
// with Find Place, Place Details, Nearby Search, and Text Search requests. Icons can be used inline.

// ⚫ Fields:
// - Each Place icon contains these fields:
// "icon" returns the URL for a colored 71px x 71px PNG icon.
// "icon_mask_base_uri" returns the base URL for a non-colored icon, minus the file type extension (append .svg or .png).
// "icon_background_color" returns the default HEX color code for the place's category.

/** Video 8 : Session Tokens **/
// Place Autocomplete uses session tokens to group the query and selection phases of a user autocomplete search into a discrete session for billing purposes.
// The session begins when the user starts typing a query, and concludes when they select a place and a call to Place Details is made.
// Each session can have multiple autocomplete queries, followed by one place selection.
// The API key(s) used for each request within a session must belong to the same Google Cloud Console project.
// Once a session has concluded, the token is no longer valid; your app must generate a fresh token for each session.

// We recommend the following guidelines:
//
// Use session tokens for all autocomplete sessions.
// Generate a fresh token for each session.
// Ensure that the API key(s) used for all Place Autocomplete and Place Details requests within a session belong to the same Google Cloud Console project.
// Be sure to pass a unique session token for each new session. Using the same token for more than one session will result in each request being billed individually.

// Example:
// As the user types a query, an autocomplete request is called every few keystrokes (not per-character),
// and a list of possible results is returned. When the user makes a selection from the result list,
// the selection counts as a request, and all of the requests made during the search are bundled and
// counted as a single request. If the user selects a place, the search query is available at no charge,
// and only the Place data request is charged. If the user does not make a selection within
// a few minutes of the beginning of the session, only the search query is charged.