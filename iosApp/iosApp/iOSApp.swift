import SwiftUI
import shared

@main
struct iOSApp: App {
    private let animeListUseCase: AnimeListUseCase = AnimeListUseCase();
    
//    init() {
//            HelperKt.doInitKoin()
//    }
    
    init() {
        HelperKt.doInitKoin()
    }
    
	var body: some Scene {
		WindowGroup {
			AnimeListScreen(animeListUseCase: animeListUseCase)
		}
	}
}
