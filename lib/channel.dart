

import 'package:flutter/services.dart';

class ShowOverlayChannel {
  static const _platform = const MethodChannel("bug/show_transparent");

  Future<void> showTransparentOverlay() async {
    await _platform.invokeMethod("showTransparentOverlay");
  }
}